package without.templatemethod;

public class MasterCard extends Card {

    public MasterCard(String creditCardNumber, String customerName, String validDate, int securityCode) {
        super(creditCardNumber, customerName, validDate, securityCode);
    }

    @Override
    public boolean validateCard(Card card) {
        // logic to validate visa card
        System.out.println("Validate visa master card with card number " + card.getCreditCardNumber());
        return true;
    }
}
