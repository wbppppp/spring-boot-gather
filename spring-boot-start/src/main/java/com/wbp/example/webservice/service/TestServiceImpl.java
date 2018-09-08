package com.wbp.example.webservice.service;

import org.springframework.stereotype.Component;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "TestService", // 与接口中指定的name一致
        targetNamespace = "http://service.webservice.example.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.wbp.example.webservice.service.TestService"// 接口地址
)
@Component
public class TestServiceImpl implements TestService {

    @Override
    public String sendMessage(String username) {
        return "hello "+username;
    }

    /**
     * 在接口实现类上使用@WebMethod(exclude=true)可以不发布该接口
     *
     * @param test
     * @return
     */
    @WebMethod(exclude = true)
    @Override
    public String test(String test) {
        return "not cxf method -->" + "test";
    }
}