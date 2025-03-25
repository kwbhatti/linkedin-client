package com.chimpcentral.linkedin.common.utils;

import java.io.File;

public abstract class JSONObject<T extends JSONObject<T>> {

    public JSONObject(Class<T> cla$$, File file) {
        JSONObject<T> jsonObject = (JSONObject<T>) JSONUtils.toJSONObject(cla$$, file);
        this.copy(jsonObject);
    }

    protected abstract void copy(JSONObject<T> jsonObject);



}
