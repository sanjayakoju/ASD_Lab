package org.example;

public class SpeedingHandler extends Handler {
    public SpeedingHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Camera camera) {
        if (camera.isSpeeding()) {
            System.out.println("Handle Speeding");
            System.out.println(camera);
        } else {
            nextHandler.handle(camera);
        }
    }
}
