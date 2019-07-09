package expandcustomer.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class CreateCustomerEventListener extends AbstractEventListener<CreateCustomerEvent> {
    private final static String CREATE_CUSTOMER_EVENT = "Create customer %s with uid = %s";
    @Override
    protected void onEvent(CreateCustomerEvent createCustomerEvent) {
        System.out.println(String.format(CREATE_CUSTOMER_EVENT,
                createCustomerEvent.getName(),
                createCustomerEvent.getUid()));
    }
}
