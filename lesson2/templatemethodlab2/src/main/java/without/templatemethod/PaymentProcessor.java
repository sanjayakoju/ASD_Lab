package without.templatemethod;

public class PaymentProcessor {

	protected void proccessPayment(double amount, String currency, String paymentType, Customer customer,
                                   Card card) {
		double dollarAmount = amount;

		if (currency.contentEquals("EUR")) { // European Euro
			dollarAmount = amount * 1.1;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}
		if (currency.contentEquals("INR")) { // Indian Rupee
			dollarAmount = amount * 0.014;
			System.out.println("Convert "+amount+" "+currency+" to US dollars");

		}

		if (paymentType.equals("visa")) {
			boolean validation = validateCard(card);
			if (validation) {
				// logic to perform payment visa card
				System.out.println("Perform payment with visa card with card number " + card.getCreditCardNumber()
						+ " and amount $" + dollarAmount);

				// logic to notify customer
				System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
						+ " about visa credit card payment with card number " + card.getCreditCardNumber());
			}
		} else if (paymentType.equals("paypal")) {

			boolean validation = validateCard(card);
			if (validation) {
				// logic to perform paypal payment
				System.out.println("Perform payment with paypal"+ amount +"$"+dollarAmount);

				// logic to notify customer
				System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment");
			}

		} else if (paymentType.equals("master card")) {
			boolean validation = validateCard(card);
			if (validation) {
				// logic to perform paypal payment
				System.out.println("Perform payment with master card"+ amount +"$"+dollarAmount);

				// logic to notify customer
				System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about master payment");
			}
		}

	}
	
	private boolean validateCard(Card card) {
		card.validateCard(card);
        return true;
	}
}
