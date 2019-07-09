package expandcustomer.interceptors;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import expandcustomer.events.CreateCustomerEvent;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateCustomerInterceptor implements PrepareInterceptor<CustomerModel> {
    @Autowired
    private EventService eventService;

    @Override
    public void onPrepare(CustomerModel customerModel, InterceptorContext interceptorContext) throws InterceptorException {
        eventService.publishEvent(new CreateCustomerEvent(customerModel.getUid(), customerModel.getName()));
    }
}
