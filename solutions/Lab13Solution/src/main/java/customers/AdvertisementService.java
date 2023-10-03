package customers;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {
	@EventListener
	public void onEvent(NewCustomerEvent event) {
		System.out.println("AdvertisementService received new customer event :" + event.getCustomer());
	}

}
