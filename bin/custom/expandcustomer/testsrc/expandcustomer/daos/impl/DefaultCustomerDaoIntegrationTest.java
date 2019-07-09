package expandcustomer.daos.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import expandcustomer.daos.CustomerDao;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

@IntegrationTest
public class DefaultCustomerDaoIntegrationTest extends ServicelayerTransactionalTest {
    private static final String CUSTOMER_ID = "TC104";
    private static final String NAME = "vlad";
    private static final String UID = "customer4";
    private static final String EMPTY_ID = "";

    @Resource
    private CustomerDao customerDao;

    @Resource
    private ModelService modelService;

    @Test
    public void shouldReturnCustomerByCode() {
        CustomerModel customer = modelService.create(CustomerModel.class);
        customer.setCustomerID(CUSTOMER_ID);
        customer.setName(NAME);
        customer.setUid(UID);
        modelService.save(customer);

        List<CustomerModel> customerByCode = customerDao.findCustomersById(CUSTOMER_ID);
        Assert.assertEquals(CUSTOMER_ID, customerByCode.get(0).getCustomerID());
        Assert.assertEquals(NAME, customerByCode.get(0).getName());
        Assert.assertEquals(UID, customerByCode.get(0).getUid());
    }

    @Test
    public void shouldReturnEmptyList_emptyStringParam() {
        List<CustomerModel> customerModels = customerDao.findCustomersById(EMPTY_ID);

        Assert.assertTrue(customerModels.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnException_nullStringParam() {
        customerDao.findCustomersById(null);
    }
}