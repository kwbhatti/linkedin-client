package com.chimpcentral;

import com.chimpcentral.linkedin.common.pojo.JobInfo;
import com.chimpcentral.linkedin.ui.LinkedInUI;
import com.chimpcentral.linkedin.ui.JobsActions;
import org.testng.annotations.Test;

import java.util.List;

public class LinkedInUITests {

    @Test
    void scrapeJobs() {

        List<JobInfo> jobInfoList = LinkedInUI.jobsActions.scrapeJobs();
    }
}
