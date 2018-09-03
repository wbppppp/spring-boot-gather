package com.wbp.mybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/7/31 0031.
 */
@Configuration
@EnableConfigurationProperties(CatConfiguration.class) //注入配置类，使用该注解
public class CatConfigurationProperties {

    /**
     * 不添加@EnableConfigurationProperties注解无法注入该配置类
     *
     */
    @Autowired
    private CatConfiguration catConfiguration;

    private int id;

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(){
        System.out.println(catConfiguration.getName());
    }
}
