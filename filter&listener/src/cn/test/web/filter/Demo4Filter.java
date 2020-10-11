package cn.test.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter("/index.jsp")
public class Demo4Filter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("Demo4执行了");
        chain.doFilter(req, resp);     //放行
        System.out.println("Demo4回来了");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
