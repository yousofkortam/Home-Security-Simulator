package com.fawry.sensor;

public class SensorInfo {

    private boolean detected;
    private boolean started;


    public SensorInfo() {
        this.detected = false;
        this.started = false;
    }

    public void setDetected(boolean detected) {
        this.detected = detected;
    }

    public boolean isDetected() {
        return detected;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

}
