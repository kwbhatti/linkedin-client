package com.chimpcentral.linkedin.ui;

import com.codeborne.selenide.Selenide;

public class LinkedInUI {

    static final String URL = "https://www.linkedin.com/";

    static void open() {
        Utils.setSelenideConfig();
        Selenide.open(URL);
    }

    public static Actions actions = new Actions();
}
