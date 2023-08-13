package org.example;

public class CameraHandler {

    private Handler chainOfHandlers;

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }

    public void handleCamera(Camera camera) {
        chainOfHandlers.handle(camera);
    }
}
