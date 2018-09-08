package com.wbp.quartz.task;

import com.wbp.quartz.service.HelloService;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/24 0024.
 */
@Service
public class MyTask extends BaseTask{

    @Autowired
    private Scheduler scheduler;

    /**
     * Quartz框架中job是由Quartz框架【动态】创建的，所以在job使用spring bean
     *
     * 是无法使用的（Job类不是一个spring bean）
     *
     * 所以我们需要将job交给spring进行管理
     * ===================================
     * 使用AutowiredCapableBeanFactory进行自动注入job
     *
      */
    @Autowired
    private HelloService helloService;


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("mytask :" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        helloService.hello();
    }

}
