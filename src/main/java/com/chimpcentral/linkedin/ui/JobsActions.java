package com.chimpcentral.linkedin.ui;

import com.chimpcentral.linkedin.common.pojo.JobInfo;
import com.chimpcentral.linkedin.common.utils.EnvConfig;
import com.chimpcentral.linkedin.common.utils.Wait;

import java.time.Duration;
import java.util.List;

public class JobsActions extends Actions {

    public List<JobInfo> scrapeJobs(Options options) {
        setup();
        JobsPage jobsPage = new LinkedInUI().openJobsPage(EnvConfig.linkedInEmail, EnvConfig.linkedInPassword);
        Wait.forDuration(Duration.ofSeconds(5));
        return null;
    }

    public List<JobInfo> scrapeJobs() {
        return scrapeJobs(new Options());
    }


    public static class Options {

    }

}
