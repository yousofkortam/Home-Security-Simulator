package com.fawry;

import com.fawry.sensor.Sensor;
import com.fawry.sensor.factories.HoneywellSensorFactory;
import com.fawry.sensor.factories.SensorFactory;
import com.fawry.sensor.factories.SiemensSensorFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create motion sensor form siemens company
        SensorFactory siemensSensorFactory = new SiemensSensorFactory();
        Sensor motionSensor = siemensSensorFactory.createMotionSensor();

        // Create smoke sensor form Honeywell company
        SensorFactory honeywellSensorFactory = new HoneywellSensorFactory();
        Sensor smokeSensor = honeywellSensorFactory.createSmokeSensor();

        while (true) {
            int motionDistance = new Random().nextInt(100);
            int sensorRange = new Random().nextInt(1000);

            if (motionDistance > 75) {
                motionSensor.detect();
            }

            if (sensorRange > 647) {
                smokeSensor.detect();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}