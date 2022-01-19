package com.salah.introtodesignpatterns.adapter.JsonConverterExample;

import com.salah.introtodesignpatterns.helpers.JsonObject;

public class WebAdapter implements WebRequester {

    private final WebService webService;

    public WebAdapter(WebService webService) {
        this.webService = webService;
    }

    @Override
    public int request(Object object) {
        System.out.println("Converting to Json");
        JsonObject result = toJson(object);
        System.out.println("making the request");
        JsonObject response = webService.request(result);
        if (response != null) {
            return 200;
        }
        return 500;

    }

    private JsonObject toJson(Object request) {
        return (JsonObject) request;
    }


}
