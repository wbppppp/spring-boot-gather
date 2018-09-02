package com.quartz.task;

import com.quartz.job.HelloJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * 任务基础类
 *
 */
public class BaseTask implements Job {

    @Autowired
    private Scheduler scheduler;

    @PostConstruct //等同于init-method
    public void init() throws Exception {

        System.out.println("simpleName --> " + this.getClass().getSimpleName());

        //JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("job1","group1").build();
        //ScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        //Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(scheduleBuilder).build();

        JobDetail jobDetail = JobBuilder.newJob(this.getClass()).withIdentity("job1","group1").build();
        Trigger trigger = TriggerBuilder.newTrigger().withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

        //启动job
        scheduler.scheduleJob(jobDetail,trigger);
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
