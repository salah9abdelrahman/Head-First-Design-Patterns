package com.salah.introtodesignpatterns.adapter.JsonConverterExample.before;

import com.salah.introtodesignpatterns.helpers.JsonObject;

public class WebClient {

    private final WebService webService;

    public WebClient(WebService webService) {
        this.webService = webService;
    }

    public Object makeObject() {
        return new Object();
    }

    public void doWork() {
         webService.request(toJson());
    }


    private JsonObject toJson() {
        return (JsonObject) makeObject();
    }
}
