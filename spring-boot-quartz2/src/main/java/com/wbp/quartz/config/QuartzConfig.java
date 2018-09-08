package com.wbp.quartz.config;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * quartz配置类
 */
@Configuration
public class QuartzConfig {

    @Autowired
    private SpringJobBeanFactory springJobBeanFactory;

    //创建调度工厂
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();

        //把job交给spring管理，这样就可以在job类中注入spring bean
        schedulerFactoryBean.setJobFactory(springJobBeanFactory);
        return schedulerFactoryBean;
    }

    //调度工厂创建调度类
    @Bean
    public Scheduler scheduler(){
        return schedulerFactoryBean().getScheduler();
    }

}
