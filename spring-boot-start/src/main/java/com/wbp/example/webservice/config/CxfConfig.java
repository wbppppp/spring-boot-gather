package com.wbp.example.webservice.config;

import com.wbp.example.webservice.service.TestService;
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
@ComponentScan({"com.wbp.example.webservice.service"})
public class CxfConfig {

    /**
     *    使用idea时发现，在配置类(@Configuration)中无法注入service，是在扫描配置类时
     * 还没有对service进行扫描，导致无法注入，在配置上添加@ComponentScan对包进行扫
     * 描即可，未测试其他工具
     *
     */
    @Autowired
    private TestService testService;

    @Bean
    public ServletRegistrationBean disServlet() {
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