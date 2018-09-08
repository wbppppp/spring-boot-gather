package com.wbp.quartz.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * 用于配置到Quartz的配置bean中，将job类交由spring管理
 */
@Component
public class SpringJobBeanFactory extends AdaptableJobFactory{

    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);

        autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
