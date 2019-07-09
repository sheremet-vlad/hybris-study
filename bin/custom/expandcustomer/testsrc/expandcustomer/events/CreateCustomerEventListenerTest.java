package expandcustomer.events;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

@IntegrationTest
public class CreateCustomerEventListenerTest extends ServicelayerTest {
    private static final String CUSTOMER_ID = "TC105";
    private static final String NAME = "vlad";
    private static final String UID = "customer5";
    private static final String EMPTY_ID = "";

    @Resource
    private ModelService modelService;

    private CustomerModel customer;

    @Before
    public void setUp() {
        customer = modelService.create(CustomerModel.class);
        customer.setCustomerID(CUSTOMER_ID);
        customer.setName(NAME);
        customer.setUid(UID);
    }

    @Test
    public void should() {
        modelService.save(customer);
    }
}
