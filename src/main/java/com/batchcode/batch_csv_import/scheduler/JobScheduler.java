package com.batchcode.batch_csv_import.scheduler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class JobScheduler {
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job importUserJob;

    @Scheduled(cron = "${csv.to.db.import.cron}")
    public void runJob() throws Exception{
        jobLauncher.run(importUserJob,
                new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters());
    }
}
