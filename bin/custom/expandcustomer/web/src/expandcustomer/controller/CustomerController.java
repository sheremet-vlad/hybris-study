package expandcustomer.controller;

import expandcustomer.facades.CustomerFacade;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping( value = "/customers")
public class CustomerController {
    private static final String CUSTOMERS_PAGE = "customers";
    private static final String CUSTOMERS_ATTRIBUTE = "customers";
    private static final String CUSTOMER_DETAILS_ATTRIBUTE = "customerDetails";
    private static final String CUSTOMER_DETAILS_PAGE = "customerDetails";

    @Resource
    private CustomerFacade customerFacade;

    @GetMapping
    public String getCustomersPage(Model model) {
        model.addAttribute(CUSTOMERS_ATTRIBUTE, customerFacade.getCustomersData());
        return  CUSTOMERS_PAGE;
    }

    @GetMapping(value = "/{customerId}")
    public String getCustomerDetailsPage(@PathVariable String customerId, Model model) {
        model.addAttribute(CUSTOMER_DETAILS_ATTRIBUTE, customerFacade.getCustomerDetailsData(customerId));
        return CUSTOMER_DETAILS_PAGE;
    }
}
