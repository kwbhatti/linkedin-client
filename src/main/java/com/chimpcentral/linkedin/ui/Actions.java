package com.chimpcentral.linkedin.ui;

import com.chimpcentral.linkedin.common.utils.EnvConfig;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import java.time.Duration;
import java.util.Map;
import java.util.logging.Level;

public class Actions {

    static void setSelenideConfig() {
        Configuration.timeout = Duration.ofSeconds(5).toMillis();
        Configuration.fastSetValue = true;
        Configuration.savePageSource = true;
        WebDriverRunner.addListener(new DriverListener());
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences loggingPreferences = new LoggingPreferences();
        loggingPreferences.enable(LogType.BROWSER, Level.ALL);
        loggingPreferences.enable(LogType.PERFORMANCE, Level.ALL);
        options.setCapability("goog:loggingPrefs", loggingPreferences);
        Map<String, Object> preferences = Map.of(
                "profile.default_content_settings.popups", 0,
                "download.prompt_for_download", "false"
        );
        options.setExperimentalOption("prefs", preferences);
        options.addArguments("--start-maximized");
        options.addArguments("disable-dev-shm-usage");
        Configuration.browserCapabilities = options;
    }

    static void setup() {
        EnvConfig.load();
        setSelenideConfig();
    }


}
