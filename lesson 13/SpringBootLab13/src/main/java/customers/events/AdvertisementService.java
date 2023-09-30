package customers.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {

    @EventListener
    public void onEvent(NewCustomerEvent event){
        System.out.println("\n*********EVENT-Advertisement*************");
        System.out.println("Received event : "+ event.getCustomer());
    }
}
