package expandcustomer.daos.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import expandcustomer.daos.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "customerDao")
public class DefaultCustomerDao implements CustomerDao {
    private final static String FIND_ALL_CUSTOMERS = "select {%s} " +
            "from {%s}";
    private final static String FIND_CUSTOMER_BY_ID = "select {%s}" +
            "from {%s}" +
            "where {%s}=?customerId";

    @Autowired
    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<CustomerModel> findCustomers() {
        String query = String.format(FIND_ALL_CUSTOMERS, CustomerModel.PK, CustomerModel._TYPECODE);
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        return flexibleSearchService.<CustomerModel>search(flexibleSearchQuery).getResult();
    }

    @Override
    public List<CustomerModel> findCustomersById(String id) {
        if (id == null) {
            throw new IllegalArgumentException();
        }

        String query = String.format(FIND_CUSTOMER_BY_ID, CustomerModel.PK,
                CustomerModel._TYPECODE, CustomerModel.CUSTOMERID);
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.addQueryParameter(CustomerModel.CUSTOMERID, id);

        return flexibleSearchService.<CustomerModel> search(flexibleSearchQuery).getResult();
    }
}
