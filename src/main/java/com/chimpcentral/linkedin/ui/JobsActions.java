package com.chimpcentral.linkedin.ui;

import com.chimpcentral.linkedin.common.pojo.JobInfo;
import com.chimpcentral.linkedin.common.utils.Wait;

import java.time.Duration;
import java.util.List;

public class JobsActions {


    public List<JobInfo> scrapeJobs(Options options) {

        Wait.forDuration(Duration.ofSeconds(10));
        return null;
    }


    public static class Options {

    }

}
