package com.wbp.task.job;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;




/**
 * Created by Administrator on 2018/6/24 0024.
 */
@Component
public class Schedutask {

    public void execute(){
        System.out.println("任务执行：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

}
