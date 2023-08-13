package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CameraHandler cameraHandler = new CameraHandler();

        UnPaidTicketHandler unPaidTicketHandler = new UnPaidTicketHandler(null);
        NotRegisteredHandler notRegisteredHandler = new NotRegisteredHandler(unPaidTicketHandler);
        SpeedingHandler speedingHandler = new SpeedingHandler(notRegisteredHandler);
        StolenHandler stolenHandler = new StolenHandler(speedingHandler);

        cameraHandler.setChainOfHandlers(speedingHandler);

        cameraHandler.handleCamera(new Camera(1, 1234, 20, false, false, true, false));
        cameraHandler.handleCamera(new Camera(2, 4567, 40, true, false, false, false));
        cameraHandler.handleCamera(new Camera(3, 6745, 50, false, true, false, false));
        cameraHandler.handleCamera(new Camera(4, 1223, 60, false, false, false, true));


    }
}
