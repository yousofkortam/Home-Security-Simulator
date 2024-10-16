package com.fawry.sensor.smoke;

import com.fawry.logger.MyLogger;
import com.fawry.sensor.Sensor;
import com.fawry.sensor.SensorInfo;

public class HoneywellSmokeSensor extends SensorInfo implements Sensor {


    MyLogger logger = MyLogger.getInstance();

    public HoneywellSmokeSensor() {
        start();
    }

    @Override
    public void start() {
        if (this.isStarted()) return;
        this.setStarted(true);
        logger.logInfo("Honeywell Smoke Sensor started");
    }

    @Override
    public void stop() {
        if (!this.isStarted()) return;
        this.setStarted(false);
        logger.logInfo("Honeywell Smoke Sensor stopped");
    }

    @Override
    public void detect() {
        this.setDetected(true);
        logger.logWarning("Honeywell Motion Sensor detected");
        // TODO: Implement detect logic
    }

}
