package com.example.webservice.config;

import com.example.webservice.service.TestService;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.example.webservice.service"})
public class CxfConfig {

    @Autowired
    private TestService testService;

    @Bean
    public ServletRegistrationBean dispatcherServlet() {

        //不添加该配置，默认会拦截/services/xx
        return new ServletRegistrationBean(new CXFServlet(),"/cxf/*");
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), testService);
        endpoint.publish("/testService");
        return endpoint;
    }
}