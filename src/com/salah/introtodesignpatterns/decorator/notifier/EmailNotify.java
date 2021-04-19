package com.salah.introtodesignpatterns.decorator.notifier;

/**
 * concrete component
 */
public class EmailNotify extends Notifiable {
    @Override
    String send(String message) {
        return "sending email with body: " + message;
    }
}
