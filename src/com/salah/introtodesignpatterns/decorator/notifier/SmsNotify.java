package com.salah.introtodesignpatterns.decorator.notifier;

/**
 * concrete decorator
 */
public class SmsNotify extends Notifiable {
    Notifiable notifiable;

    public SmsNotify(Notifiable notifiable) {
        this.notifiable = notifiable;
    }

    @Override
    String send(String message) {
        return notifiable.send(message) + "\t" + "sending sms with body:" + message;
    }
}
