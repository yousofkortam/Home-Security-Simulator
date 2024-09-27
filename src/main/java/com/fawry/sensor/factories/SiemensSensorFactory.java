package com.fawry.sensor.factories;

import com.fawry.sensor.Sensor;
import com.fawry.sensor.motion.SiemensMotionSensor;
import com.fawry.sensor.smoke.SiemensSmokeSensor;

public class SiemensSensorFactory implements SensorFactory {

    @Override
    public Sensor createMotionSensor() {
        return new SiemensMotionSensor();
    }

    @Override
    public Sensor createSmokeSensor() {
        return new SiemensSmokeSensor();
    }
}
