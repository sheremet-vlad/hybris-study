package expandcustomer.service;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface CustomerService {
    List<CustomerModel> getCustomers();

    CustomerModel getCustomerById(String id);
}
