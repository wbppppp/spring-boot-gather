package com.example;

import com.example.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


/**
 * Created by Administrator on 2018/6/9 0009.
 */
@SpringBootApplication
@ServletComponentScan //启动servlet扫描
public class App {

    /*@Bean
    public ServletRegistrationBean myServlet(){
        return new ServletRegistrationBean(new MyServlet1(),"/myServlet1");
    }*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class,args);
    }
}
