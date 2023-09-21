package customers;

public class CustomerDAO implements ICustomerDAO{
	private ILogger logger;
	private IEmailSender emailSender;

	public CustomerDAO(Logger logger, EmailSender emailSender) {
		this.logger = logger;
		this.emailSender = emailSender;
	}

	public void save(Customer customer) {
		// simple sleep
		try {
			Thread.sleep(350);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("CustomerDAO: saving customer "+customer.getName());
		logger.log("Customer is saved in the DB: "+ customer.getName() );
		emailSender.sendEmail("fbrown@acme.com", "Customer is saved Successfully!");
	}

}
