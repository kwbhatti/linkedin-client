package com.chimpcentral.linkedin.ui;

import com.codeborne.selenide.Selenide;

public class LinkedInUI {

    static final String URL = "https://www.linkedin.com/";

    public static JobsActions jobsActions = new JobsActions();

    LandingPage open() {
        Selenide.open(URL);
        return new LandingPage();
    }

    FeedsPage login(String username, String password) {
        return open()
                .singInWithEmail()
                .signIn(username, password);

    }

    JobsPage openJobsPage(String username, String password) {
        return login(username, password).topNav.goToJobsPage();
    }



}
