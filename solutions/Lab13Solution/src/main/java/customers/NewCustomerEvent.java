package customers;

public class NewCustomerEvent {
	private Customer customer;

	public NewCustomerEvent(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
