package com.chimpcentral.linkedin.ui;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class LoginPage extends Page<LoginPage> {

    static SelenideElement emailTextbox = $(By.id("username"));
    static SelenideElement passwordTextbox = $(By.id("password"));
    static SelenideElement signInButton = $x("//button[@aria-label = 'Sign in']");

    public FeedsPage signIn(String username, String password) {
        emailTextbox.should(visible).sendKeys(username);
        passwordTextbox.should(visible).sendKeys(password);
        signInButton.should(visible).click();
        return new FeedsPage();
    }
}
