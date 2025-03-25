package com.chimpcentral;

import com.chimpcentral.linkedin.common.utils.DotEnv;
import org.testng.annotations.Test;

public class DotEnvTest {

    @Test
    void test() {
        DotEnv.load();
        System.out.println(DotEnv.linkedInEmail);
    }
}
