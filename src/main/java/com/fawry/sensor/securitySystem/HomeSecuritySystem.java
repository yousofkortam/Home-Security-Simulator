package com.fawry.sensor.securitySystem;

import com.fawry.sensor.Sensor;

import java.util.ArrayList;
import java.util.List;

public class HomeSecuritySystem implements SecuritySystem {

    private final List<Sensor> sensors = new ArrayList<>();

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);
        System.out.println("Sensor registered");
    }

    @Override
    public void removeSensor(Sensor sensor) {
        sensors.remove(sensor);
        System.out.println("Sensor removed");
    }

    @Override
    public void detectSensors() {
        for (Sensor sensor : sensors) {
            sensor.detect();
        }
    }
}
