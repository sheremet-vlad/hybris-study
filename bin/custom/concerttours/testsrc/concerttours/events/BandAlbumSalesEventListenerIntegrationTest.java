package concerttours.events;

import concerttours.model.BandModel;
import concerttours.model.NewsModel;
import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.exceptions.ModelSavingException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class BandAlbumSalesEventListenerIntegrationTest extends ServicelayerTest {
    private static final String BAND_CODE = "101-JAZ";
    private static final String BAND_NAME = "Tight Notes";
    private static final String BAND_HISTORY = "New contemporary, 7-piece Jaz unit from London, formed in 2015";
    private static final Long MANY_ALBUMS_SOLD = Long.valueOf(1000000L);
    @Resource
    private FlexibleSearchService flexibleSearchService;
    @Resource
    private ModelService modelService;

    @Before
    public void setUp() throws Exception {
        createCoreData();
        createDefaultCatalog();
    }

    @Test(expected = ModelSavingException.class)
    public void testValidationInterceptor() {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode(BAND_CODE);
        band.setAlbumSales(Long.valueOf(-10L));
        modelService.save(band);
    }

    @Test
    public void testEventSending() throws Exception {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode(BAND_CODE);
        band.setName(BAND_NAME);
        band.setHistory(BAND_HISTORY);
        band.setAlbumSales(MANY_ALBUMS_SOLD);
        modelService.save(band);
        final NewsModel news = findLastNews();
        Assert.assertTrue("Unexpected news: " + news.getHeadline(), news.getHeadline().contains(BAND_NAME));
    }

    private NewsModel findLastNews() {
        final StringBuilder builder = new StringBuilder();
        builder.append("SELECT {n:").append(NewsModel.PK).append("} ");
        builder.append("FROM {").append(NewsModel._TYPECODE).append(" AS n} ");
        builder.append("ORDER BY ").append("{n:").append(NewsModel.CREATIONTIME).append("} DESC");
        final List<NewsModel> list = flexibleSearchService.<NewsModel>search(builder.toString()).getResult();
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Test
    public void testEventSendingAsync() throws Exception {
        final BandModel band = modelService.create(BandModel.class);
        band.setCode(BAND_CODE);
        band.setName(BAND_NAME);
        band.setHistory(BAND_HISTORY);
        band.setAlbumSales(MANY_ALBUMS_SOLD);
        modelService.save(band);
        // add sleep here to wait for event processing thread to complete
        Thread.sleep(2000L);
        final NewsModel news = findLastNews();
        Assert.assertTrue("Unexpected news: " + news.getHeadline(), news.getHeadline().contains(BAND_NAME));
    }
}