package com.fawry.sms;

import com.fawry.logger.MyLogger;

public class SMSImplementation1 implements SMS {

    MyLogger logger = MyLogger.getInstance();

    @Override
    public void sendMessage(String message) {
        logger.logInfo("Sending message using SMSImplementation1: " + message);
        System.out.println("Message = " + message);
    }

}
