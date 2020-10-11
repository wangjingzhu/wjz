package cn.test.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//浏览器直接请求idex.jsp，过滤器才执行    默认为REQUEST
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//只有转发idex.jsp，过滤器才执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//直接请求和转发idex.jsp，过滤器都会执行
@WebFilter(value = "/index.jsp",dispatcherTypes ={DispatcherType.FORWARD,DispatcherType.REQUEST})
public class Demo3Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Demo3执行了");
        chain.doFilter(req, resp);     //放行
        System.out.println("Demo3回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
