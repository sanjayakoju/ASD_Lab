package customers;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerRatingService {
	@EventListener
	public void onEvent(NewCustomerEvent event) {
		System.out.println("CustomerRatingService received new customer event :" + event.getCustomer());
	}

}
