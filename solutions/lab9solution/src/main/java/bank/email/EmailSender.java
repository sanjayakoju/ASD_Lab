package bank.email;


public class EmailSender implements IEmailSender {
	private static EmailSender emailSender;

	private EmailSender() {
	}

	public static EmailSender getEmailSender() {
		if (emailSender == null) {
			synchronized (EmailSender.class) {
				if (emailSender == null)
					emailSender = new EmailSender();
			}
		}
		return emailSender;
	}

	@Override
	public void send(String message) {
		System.out.println("Emailsender send message: " + message);

	}

}
