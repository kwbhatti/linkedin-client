package com.chimpcentral;

import com.chimpcentral.linkedin.common.utils.EnvConfig;
import org.testng.annotations.Test;

public class EnvConfigTest {

    @Test
    void test() {
        EnvConfig.load();
        System.out.println(EnvConfig.linkedInEmail);
    }
}
