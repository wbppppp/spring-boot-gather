package com.wbp.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018/6/9 0009.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) throws Exception {

        /**
         * 第一种方案：
         *      创建job类，实现Job接口，并在main中调用以下步骤
         *
         * 1.获取到Scheduler实例并启动调度器
         * 2.创建具体的任务jobDetail
         * 3.创建触发器trigger
         * 4.将jobDetail和trigger交由Scheduler安排触发
         * 5.睡眠20s，关闭定时任务调度
         *
         */

        /*//1.获取到Scheduler实例并启动调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();

        //2.创建具体的任务jobDetail
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("job1","group1").build();

        //3.创建触发器trigger
        ScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").withSchedule(scheduleBuilder).build();

        //4.将jobDetail和trigger交由Scheduler安排触发
        scheduler.scheduleJob(jobDetail,trigger);

        //5.任务执行20s，关闭定时任务调度
        TimeUnit.SECONDS.sleep(20);

        scheduler.shutdown();*/

        /**
         * 第二种方案：
         *     创建任务类Schedutask，配置类ScheduledConfiguration（用来启用定时）
         *
         */
        SpringApplication.run(App.class,args);
    }
}
