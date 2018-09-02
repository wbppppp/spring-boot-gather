package com.example.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class FilterConfig implements Filter {
    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        System.out.println("filter--init()");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("chain.do()~~~before");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("chain.do()~~~after");
    }

    @Override
    public void destroy() {
        System.out.println("destory()");
    }
}
