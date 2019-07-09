package expandcustomer.service.impl;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.CustomerModel;
import expandcustomer.daos.CustomerDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@UnitTest
public class DefaultCustomerServiceUnitTest {
    private static final String CUSTOMER_ID = "TC102";
    private static final String NAME = "vlad";
    private static final String UID = "customer2";
    private static final String EMPTY_ID = "";

    private CustomerDao customerDao;
    private DefaultCustomerService customerService;
    private CustomerModel customer;

    @Before
    public void setUp() {
        customerService = new DefaultCustomerService();
        customerDao = mock(CustomerDao.class);
        customerService.setCustomerDao(customerDao);
        customer = new CustomerModel();
        customer.setCustomerID(CUSTOMER_ID);
        customer.setName(NAME);
        customer.setUid(UID);
    }

    @Test
    public void shouldReturnAllCustomers() {
        List<CustomerModel> expectedCustomers = Arrays.asList(customer);
        when(customerDao.findCustomers()).thenReturn(expectedCustomers);

        List<CustomerModel> actualCustomers = customerService.getCustomers();

        Assert.assertEquals(expectedCustomers.size(), actualCustomers.size());
        Assert.assertEquals(expectedCustomers.get(0), actualCustomers.get(0));
    }

    @Test
    public void shouldReturnCustomerById() {
        when(customerDao.findCustomersById(CUSTOMER_ID)).thenReturn(Arrays.asList(customer));

        CustomerModel custometById = customerService.getCustomerById(CUSTOMER_ID);

        Assert.assertEquals(customer, custometById);
    }
}
