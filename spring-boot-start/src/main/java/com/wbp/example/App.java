package com.wbp.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置filter，interceptor，jpa，jdbc，webservice，freemarker，单元测试，热部署
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {

        /**
         * 测试webservice：
         *
         *      启动成功后访问 http://localhost:80/cxf/testService?wsdl
         *
         */
        SpringApplication.run(App.class,args);
    }
}
