package customers.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@EnableAsync
public class CustomerRatingService {

    @EventListener
    @Async
    public void onEvent(NewCustomerEvent event){
        System.out.println("\n*********EVENT- CustomerRating*************");
        System.out.println("Received event : "+ event.getCustomer());
    }
}
