package expandcustomer.daos;

import de.hybris.platform.core.model.user.CustomerModel;

import java.util.List;

public interface CustomerDao {
    List<CustomerModel> findCustomers();

    List<CustomerModel> findCustomersById(String id);
}
