package bank.factory.testing;

import bank.factory.IEmailSender;

public class MockEmailSender implements IEmailSender {
    @Override
    public void send(String message) {
        System.out.println("Sending Email through TEST "+message);
    }
}
