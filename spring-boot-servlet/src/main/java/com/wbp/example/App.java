package com.wbp.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * Created by Administrator on 2018/6/9 0009.
 */
@SpringBootApplication
@ServletComponentScan //启动servlet扫描
public class App {

    /**
     * 第一种方式：
     *      1.创建Servlet（MyServlet1）
     *      2.通过ServletRegistrationBean注册Servlet
     *
     * 第二种方式：
     *      1.启动类上添加注解@ServletComponentScan
     *      2.创建Servlet（MyServlet2），并添加类注解@WebServlet
     *
     */
    /*@Bean
    public ServletRegistrationBean myServlet(){
        return new ServletRegistrationBean(new MyServlet1(),"/myServlet1");
    }*/

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class,args);
    }
}
