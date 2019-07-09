package expandcustomer.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class CreateCustomerEvent extends AbstractEvent {
    private final String uid;
    private final String name;

    public CreateCustomerEvent(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CreateCustomerEvent{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
