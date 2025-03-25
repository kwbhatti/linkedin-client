package com.chimpcentral.linkedin.common.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class EnvConfig {

    private static final String ENV_FILENAME = ".env";

    static Properties properties;
    public static String linkedInEmail;
    public static String linkedInPassword;

    public static void load() {
        if (properties != null) return;
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(ENV_FILENAME)) {
            properties.load(fileInputStream);
            linkedInEmail = properties.getProperty("linkedin-email");
            linkedInPassword = properties.getProperty("linkedin-password");
        } catch (IOException e) {
            throw new RuntimeException("Could not find .env file in root directory");
        }
    }

}
