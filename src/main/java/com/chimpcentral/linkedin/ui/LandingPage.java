package com.chimpcentral.linkedin.ui;

import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;

public class LandingPage extends Page<LandingPage> {

    static SelenideElement signInWithEmailButton = $x("//*[@data-test-id = 'home-hero-sign-in-cta']");

    LoginPage singInWithEmail() {
        signInWithEmailButton.should(visible).click();
        return new LoginPage();
    }
}
