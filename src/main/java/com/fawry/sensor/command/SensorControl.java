package com.fawry.sensor.command;

public class SensorControl {

    private final Command command;

    public SensorControl(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

}
