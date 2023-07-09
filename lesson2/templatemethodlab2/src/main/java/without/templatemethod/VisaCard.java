package without.templatemethod;

public class VisaCard extends Card {


    public VisaCard(String creditCardNumber, String customerName, String validDate, int securityCode) {
        super(creditCardNumber, customerName, validDate, securityCode);
    }

    @Override
    public boolean validateCard(Card card) {
        // logic to validate visa card
        System.out.println("Validate visa card with card number " + card.getCreditCardNumber());
        return true;
    }
}
