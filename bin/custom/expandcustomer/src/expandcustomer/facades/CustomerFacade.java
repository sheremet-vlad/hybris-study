package expandcustomer.facades;

import expandcustomer.data.CustomerDetailsData;
import expandcustomer.data.CustomerShortData;

import java.util.List;

public interface CustomerFacade {
    List<CustomerShortData> getCustomersData();

    CustomerDetailsData getCustomerDetailsData(String id);
}
