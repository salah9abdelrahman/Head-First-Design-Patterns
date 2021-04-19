package com.salah.introtodesignpatterns.decorator.notifier;

public class Main {
    public static void main(String[] args) {
        Notifiable notifiable = new EmailNotify();
       String notification=  notifiable.send("haha");
        System.out.println(notification);
        notifiable = new SmsNotify(notifiable);
        notification=  notifiable.send("what");
        System.out.println(notification);
        /*
        type of class is not maintainable
         */
        System.out.println(notifiable.getClass());
    }
}
