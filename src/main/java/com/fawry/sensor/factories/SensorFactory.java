package com.fawry.sensor.factories;

import com.fawry.sensor.Sensor;

public interface SensorFactory {
    Sensor createMotionSensor();
    Sensor createSmokeSensor();
}
