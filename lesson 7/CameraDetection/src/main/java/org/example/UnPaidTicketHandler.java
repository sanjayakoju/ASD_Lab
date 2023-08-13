package org.example;

public class UnPaidTicketHandler extends Handler {
    public UnPaidTicketHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Camera camera) {
        if (camera.isUnpaidTicket()) {
            System.out.println("Handle Unpaid Ticket");
            System.out.println(camera);
        } else {
            System.out.println("Could Not Able to Handle");
        }
    }
}
