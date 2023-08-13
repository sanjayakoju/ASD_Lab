package org.example;

public class Camera {

    private int cameraId;
    private int licensePlate;
    private int speed;

    private boolean isStolen;

    private boolean isSpeeding;

    private boolean isNotRegistered;

    private boolean isUnpaidTicket;

    public Camera(int cameraId, int licensePlate, int speed, boolean isStolen, boolean isSpeeding, boolean isNotRegistered, boolean isUnpaidTicket) {
        this.cameraId = cameraId;
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.isStolen = isStolen;
        this.isSpeeding = isSpeeding;
        this.isNotRegistered = isNotRegistered;
        this.isUnpaidTicket = isUnpaidTicket;
    }

    public int getCameraId() {
        return cameraId;
    }

    public void setCameraId(int cameraId) {
        this.cameraId = cameraId;
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(int licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStolen() {
        return isStolen;
    }

    public void setStolen(boolean stolen) {
        isStolen = stolen;
    }

    public boolean isNotRegistered() {
        return isNotRegistered;
    }

    public void setNotRegistered(boolean notRegistered) {
        isNotRegistered = notRegistered;
    }

    public boolean isUnpaidTicket() {
        return isUnpaidTicket;
    }

    public void setUnpaidTicket(boolean unpaidTicket) {
        isUnpaidTicket = unpaidTicket;
    }

    public boolean isSpeeding() {
        return isSpeeding;
    }

    public void setSpeeding(boolean speeding) {
        isSpeeding = speeding;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "cameraId=" + cameraId +
                ", licensePlate=" + licensePlate +
                ", speed=" + speed +
                '}';
    }
}
