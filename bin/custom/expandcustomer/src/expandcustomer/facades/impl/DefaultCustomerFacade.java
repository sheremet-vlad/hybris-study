package expandcustomer.facades.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import expandcustomer.data.CustomerDetailsData;
import expandcustomer.data.CustomerShortData;
import expandcustomer.facades.CustomerFacade;
import expandcustomer.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "customerFacade")
public class DefaultCustomerFacade implements CustomerFacade {
    @Resource
    private CustomerService customerService;

    @Override
    public List<CustomerShortData> getCustomersData() {
        List<CustomerModel> customerModelList = customerService.getCustomers();
        return customerModelList
                .stream()
                .map(p -> {
                    CustomerShortData customerShortData = new CustomerShortData();
                    customerShortData.setCode(p.getCustomerID());
                    customerShortData.setName(p.getName());
                    return customerShortData;
                }).collect(Collectors.toList());
    }

    @Override
    public CustomerDetailsData getCustomerDetailsData(String id) {
        CustomerModel customerModel = customerService.getCustomerById(id);
        CustomerDetailsData customerDetailsData = new CustomerDetailsData();
        customerDetailsData.setCode(customerModel.getCustomerID());
        customerDetailsData.setName(customerModel.getName());
        customerDetailsData.setSportCount(customerModel.getSportCount());
        return customerDetailsData;
    }
}
