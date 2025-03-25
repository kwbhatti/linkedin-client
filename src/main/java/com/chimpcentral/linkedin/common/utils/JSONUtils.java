package com.chimpcentral.linkedin.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONUtils {

    public static <T extends JSONObject<T>> JSONObject<T> toJSONObject(Class<T> cla$$, File file) {
        try {
            return new ObjectMapper().readValue(file, cla$$);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
