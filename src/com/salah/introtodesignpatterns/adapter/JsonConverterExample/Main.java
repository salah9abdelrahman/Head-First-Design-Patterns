package com.salah.introtodesignpatterns.adapter.JsonConverterExample;

public class Main {
    public static void main(String[] args) {
        /**
         * The client doesn't know anything about the adaptee
         */
        WebService webService = new WebService();
        WebRequester webRequester = new WebAdapter(webService);
        WebClient webClient = new WebClient(webRequester);
        webClient.doWork();
    }
}
