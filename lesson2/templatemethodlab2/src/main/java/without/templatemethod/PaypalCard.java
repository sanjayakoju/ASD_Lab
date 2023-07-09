package without.templatemethod;

public class PaypalCard extends Card {

    public PaypalCard(String creditCardNumber, String customerName, String validDate, int securityCode) {
        super(creditCardNumber, customerName, validDate, securityCode);
    }

    @Override
    public boolean validateCard(Card card) {
        // logic to validate visa card
        System.out.println("Validate Paypal card with card number " + card.getCreditCardNumber());
        return true;
    }
}
