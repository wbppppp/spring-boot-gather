package com.wbp.mybatis;

import com.wbp.mybatis.config.CatConfigurationProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Created by Administrator on 2018/6/9 0009.
 */
@SpringBootApplication
@MapperScan("com.wbp.mybatis.mapper")//扫描该包下相应的class
public class App {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        CatConfigurationProperties bean = context.getBean(CatConfigurationProperties.class);

        bean.test();

        context.close();
    }
}
