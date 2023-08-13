package org.example;

public class StolenHandler extends Handler {

    public StolenHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Camera camera) {
        if (camera.isStolen()) {
            System.out.println("Handle Stolen");
            System.out.println(camera);
        } else {
            nextHandler.handle(camera);
        }
    }
}
