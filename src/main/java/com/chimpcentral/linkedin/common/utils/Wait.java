package com.chimpcentral.linkedin.common.utils;

import java.time.Duration;

public class Wait {

    public static void forDuration(Duration duration) {
        try {
            Thread.sleep(duration.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
