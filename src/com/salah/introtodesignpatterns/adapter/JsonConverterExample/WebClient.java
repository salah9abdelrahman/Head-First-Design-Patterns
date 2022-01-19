package com.salah.introtodesignpatterns.adapter.JsonConverterExample;

import com.salah.introtodesignpatterns.adapter.JsonConverterExample.WebRequester;
import com.salah.introtodesignpatterns.helpers.JsonObject;

/**
 * Client
 */
public class WebClient {

    private final WebRequester webRequester;

    public WebClient(WebRequester webRequester) {
        this.webRequester = webRequester;
    }

    public Object makeObject() {
        return new Object();
    }

    public void doWork() {
        webRequester.request(makeObject());
    }


    private JsonObject toJson() {
        return (JsonObject) makeObject();
    }
}
