package cn.test.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//@WebFilter("/*")
public class Demo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器被执行了！");

        filterChain.doFilter(servletRequest, servletResponse);     //放行
    }

    @Override
    public void destroy() {

    }
}
