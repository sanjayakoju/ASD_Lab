package without.templatemethod;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Frank Brown", "fbrown@gmail.com");
		VisaCard visa = new VisaCard("1111 2222 3333 4444", "Frank Brown", "09/2026",112);
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		paymentProcessor.proccessPayment(125.75, "USD", "visa", customer1, visa);
		
		System.out.println("------------------------------------");
		
		Customer customer2 = new Customer("John Doe", "jdoe@gmail.com");
		PaypalCard paypalCard = new PaypalCard("2222 3333 4444 5555", "Jhon Doe", "10/2026", 344 );
		paymentProcessor.proccessPayment(1450.23, "USD", "paypal", customer2, paypalCard);

		System.out.println("------------------------------------");

		Customer customer3 = new Customer("Sanjaya Koju", "skoju@gmail.com");
		MasterCard masterCard = new MasterCard("3333 4444 5555 6666", "Sanjaya Koju", "07/2027", 377);
		paymentProcessor.proccessPayment(175000.0, "INR", "paypal", customer3, masterCard);

	}
}
