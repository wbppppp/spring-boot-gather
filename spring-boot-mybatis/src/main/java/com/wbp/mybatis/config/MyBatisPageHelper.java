package com.wbp.mybatis.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by Administrator on 2018/6/18 0018.
 *
 *
 * PageHelper：
 *
 *      一.与spring boot的整合，要在pom使用pagehelper-spring-boot-starter，不要引入github的，
 *          否则分页效果可能失效，这里在idea中测试失效
 *
 *      二.与spring boot整合方式有两种：
 *          ①配置实体bean，即使用@Configuration，@Bean这种注解
 *          ②在application.yaml中配置
 *
 *
 */
@Configuration
public class MyBatisPageHelper {

   @Bean
    public PageHelper pageHelper(){
        System.out.println("PageHelper分页插件===========");
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("helperDialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
