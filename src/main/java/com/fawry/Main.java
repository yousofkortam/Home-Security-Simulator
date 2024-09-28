package com.fawry;

import com.fawry.sensor.AlarmDevice;
import com.fawry.sensor.Device;
import com.fawry.sensor.Sensor;
import com.fawry.sensor.command.Command;
import com.fawry.sensor.command.TurnOffCommand;
import com.fawry.sensor.command.TurnOnCommand;
import com.fawry.sensor.factories.HoneywellSensorFactory;
import com.fawry.sensor.factories.SensorFactory;
import com.fawry.sensor.factories.SiemensSensorFactory;
import com.fawry.sms.SMS;
import com.fawry.sms.SMSAdapter;
import com.fawry.sms.SMSImplementation1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create motion sensor form siemens company
        SensorFactory siemensSensorFactory = new SiemensSensorFactory();
        Sensor motionSensor = siemensSensorFactory.createMotionSensor();

        // Create smoke sensor form Honeywell company
        SensorFactory honeywellSensorFactory = new HoneywellSensorFactory();
        Sensor smokeSensor = honeywellSensorFactory.createSmokeSensor();

        Device alarm = new AlarmDevice();

        Command turnOnAlarm = new TurnOnCommand(alarm);
        Command turnOffAlarm = new TurnOffCommand(alarm);

        SMS smsService = new SMSImplementation1();
        SMSAdapter smsAdapter = new SMSAdapter(smsService);

        while (true) {
            int motionDistance = new Random().nextInt(100);
            int sensorRange = new Random().nextInt(1000);

            if (motionDistance > 75) {
                motionSensor.detect();
                waitSeconds(1000);
                turnOnAlarm.execute();
                waitSeconds(1000);
                smsAdapter.notifyOwner("Smoke detected !!! Alarm turned on");
                waitSeconds(3000);
                turnOffAlarm.execute();
                waitSeconds(1000);
            }

            if (sensorRange > 647) {
                smokeSensor.detect();
                waitSeconds(1000);
                turnOnAlarm.execute();
                waitSeconds(1000);
                smsAdapter.notifyOwner("Motion detected !!! Alarm turned on");
                waitSeconds(3000);
                turnOffAlarm.execute();
                waitSeconds(1000);
            }

            waitSeconds(1000);
        }
    }


    public static void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}