package customers;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("Test")
public class CustomerDAOMock implements ICustomerDAO{

	public void save(Customer customer) {
		
		System.out.println("CustomerDAOMock: saving customer "+customer.getName());
	}
}
