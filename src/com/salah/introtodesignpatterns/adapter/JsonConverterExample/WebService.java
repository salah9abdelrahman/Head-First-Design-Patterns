package com.salah.introtodesignpatterns.adapter.JsonConverterExample;

import com.salah.introtodesignpatterns.helpers.JsonObject;

/**
 * Adaptee
 */
public class WebService {
    public JsonObject request(JsonObject jsonObject) {
        return new JsonObject();
    }
}
