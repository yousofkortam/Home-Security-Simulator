package com.fawry.sensor.factories;

import com.fawry.sensor.Sensor;
import com.fawry.sensor.motion.HoneywellMotionSensor;
import com.fawry.sensor.smoke.HoneywellSmokeSensor;

public class HoneywellSensorFactory implements SensorFactory {

    @Override
    public Sensor createMotionSensor() {
        return new HoneywellMotionSensor();
    }

    @Override
    public Sensor createSmokeSensor() {
        return new HoneywellSmokeSensor();
    }
}
