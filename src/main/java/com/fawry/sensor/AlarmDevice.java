package com.fawry.sensor;

public class AlarmDevice implements Device {
    @Override
    public void turnOn() {
        System.out.println("Turning on alarm device");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off alarm device");
    }
}
