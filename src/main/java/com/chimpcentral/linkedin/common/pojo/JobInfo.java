package com.chimpcentral.linkedin.common.pojo;

import com.chimpcentral.linkedin.common.utils.JSONObject;

import java.io.File;

public class JobInfo extends JSONObject<JobInfo> {

    public String title;
    public String link;

    public JobInfo(File file) {
        super(JobInfo.class, file);
    }

    @Override
    protected void copy(JSONObject<JobInfo> jsonObject) {

    }
}
