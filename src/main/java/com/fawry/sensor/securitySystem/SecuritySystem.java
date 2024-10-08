package com.fawry.sensor.securitySystem;

import com.fawry.sensor.Sensor;

public interface SecuritySystem {
    void registerSensor(Sensor sensor);
    void removeSensor(Sensor sensor);
    void detectSensors();
}
