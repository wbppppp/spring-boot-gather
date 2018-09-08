package com.wbp.example.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@Configuration
public class WebMvcFilterConfig {

    @Bean
    public FilterRegistrationBean registrationFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        FilterConfig filterConfig = new FilterConfig();
        filterRegistrationBean.setFilter(filterConfig);
        List<String> urls = new ArrayList<>();
        urls.add("/ftl/hello");
        filterRegistrationBean.setUrlPatterns(urls);
        filterRegistrationBean.setOrder(Integer.MAX_VALUE);

        return filterRegistrationBean;
    }


}
