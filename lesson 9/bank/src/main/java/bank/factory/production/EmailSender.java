package bank.factory.production;

import bank.factory.IEmailSender;

public class EmailSender implements IEmailSender {

    private static EmailSender emailSender;

    private EmailSender() {
        if(emailSender != null) {
            throw  new RuntimeException("Use getEmailSender Method to get the single instance of this class!");
        }
    }

    // Singleton Instance Created
    public static EmailSender getEmailSender() {
        if (emailSender == null) {
            synchronized (EmailSender.class) {
                if (emailSender == null) {
                    emailSender = new EmailSender();
                }
            }
        }
        return emailSender;
    }
    @Override
    public void send(String message) {
        System.out.println("Sending email from Production: "+message);
    }
}
