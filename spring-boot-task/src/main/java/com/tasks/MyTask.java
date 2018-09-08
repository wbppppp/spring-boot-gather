package com.tasks;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/23 0023.
 */
@Configuration
@EnableScheduling
public class MyTask {

    /**
     * 10s执行一次
     *
     */
    @Scheduled(cron = "0/10 * * * * *")
    public void task1(){
        Date date = new Date();
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        System.out.println("10秒钟执行一次" + now);
    }

    /**
     * 每分钟执行一次
     *
     */
    @Scheduled(cron = "0 0/1 * * * *")
    public void task2(){
        Date date = new Date();
        String now = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);

        System.out.println("一分钟执行一次" + now);
    }

}
