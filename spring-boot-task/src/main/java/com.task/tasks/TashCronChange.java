package com.task.tasks;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@RestController
@EnableScheduling
public class TashCronChange implements SchedulingConfigurer{

    private static String cron = "0/5 * * * * *";

    @RequestMapping("changeCron")
    public String changeExpression(){
        cron = "0/10 * * * * *";
        return "changeExpression";
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(()->{
            System.out.println("修改定时任务"+new Date());
        },(x) -> {
            CronTrigger cronTrigger = new CronTrigger(cron);
            return  cronTrigger.nextExecutionTime(x);
        });
    }
}
