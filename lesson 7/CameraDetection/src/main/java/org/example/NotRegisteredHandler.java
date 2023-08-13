package org.example;

public class NotRegisteredHandler extends Handler {
    public NotRegisteredHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Camera camera) {
        if (camera.isNotRegistered()) {
            System.out.println("Handle Not Registered");
            System.out.println(camera);
        } else {
            nextHandler.handle(camera);
        }
    }
}
