package expandcustomer.attributehandlers;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Service;

@Service
public class SportCountAttributeHandler extends AbstractDynamicAttributeHandler<Integer, CustomerModel> {
    @Override
    public Integer get(CustomerModel model) {
        return model.getCustomerSport().size();
    }
}
