package expandcustomer.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import expandcustomer.daos.CustomerDao;
import expandcustomer.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "customerService")
public class DefaultCustomerService implements CustomerService {
    private static final String ERROR_MESSAGE_NOT_FOUND = "Customer with %s id not found";
    private static final String ERROR_MESSAGE_ID_NOT_UNIQUE = "%s is not unique";

    @Resource
    private CustomerDao customerDao;

    @Override
    public List<CustomerModel> getCustomers() {
        return customerDao.findCustomers();
    }

    @Override
    public CustomerModel getCustomerById(String id) {
        List<CustomerModel> customerModels = customerDao.findCustomersById(id);
        if (customerModels.isEmpty()) {
            throw new IllegalArgumentException(String.format(ERROR_MESSAGE_NOT_FOUND, id));
        } else if (customerModels.size() > 1) {
            throw new IllegalArgumentException(String.format(ERROR_MESSAGE_ID_NOT_UNIQUE, id));
        }
        return customerModels.get(0);
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
