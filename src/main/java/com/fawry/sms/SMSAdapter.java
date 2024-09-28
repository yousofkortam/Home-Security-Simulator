package com.fawry.sms;

public class SMSAdapter {

    private final SMS sms;

    public SMSAdapter(SMS sms) {
        this.sms = sms;
    }

    public void notifyOwner(String notificationMessage) {
        sms.sendMessage(notificationMessage);
    }

}
