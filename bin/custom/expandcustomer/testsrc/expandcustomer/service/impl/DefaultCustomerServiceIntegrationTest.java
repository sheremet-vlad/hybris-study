package expandcustomer.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.model.ModelService;
import expandcustomer.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

@IntegrationTest
public class DefaultCustomerServiceIntegrationTest extends ServicelayerTest {
    private static final String CUSTOMER_ID = "TC102";
    private static final String NAME = "vlad";
    private static final String UID = "customer2";
    private static final String EMPTY_ID = "";

    @Resource
    private CustomerService customerService;

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

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnException_emptyStringParam() {
        customerService.getCustomerById(EMPTY_ID);
    }

    @Test
    public void shouldReturnAllCustomers() {
        int expectedSize = customerService.getCustomers().size() + 1;

        modelService.save(customer);
        int actualSize = customerService.getCustomers().size();
        for (int i = 0; i < customerService.getCustomers().size(); i++) {
            System.out.println(customerService.getCustomers().get(i).getCustomerID());
        }

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void shouldReturnCustomerById() {
        modelService.save(customer);

        CustomerModel customerById = customerService.getCustomerById(CUSTOMER_ID);

        Assert.assertEquals(CUSTOMER_ID, customerById.getCustomerID());
        Assert.assertEquals(NAME, customerById.getName());
    }
}
