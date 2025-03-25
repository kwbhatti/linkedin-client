package com.chimpcentral.linkedin.ui;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Page<T extends Page<T>> extends Container<T> {

    public TopNav topNav = new TopNav();

    public static class TopNav extends Container<TopNav> {

        SelenideElement selenideElement = $(By.tagName("nav"));
        SelenideElement jobsButton = selenideElement.$x(".//a[@href = 'https://www.linkedin.com/jobs/?']");

        public JobsPage goToJobsPage() {
            jobsButton.should(visible).click();
            return new JobsPage();
        }
    }
}
