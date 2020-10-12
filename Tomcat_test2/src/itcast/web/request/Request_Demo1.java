package itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Request_Demo1")
public class Request_Demo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * 获取请求行的重要方法  获取请求方式 获取虚拟目录  获取请求URI/URL*/
        String method = request.getMethod();
        System.out.println(method);
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURL);
        /*
             GET
            /WJZ3
            /WJZ3/Request_Demo1
            http://localhost:8080/WJZ3/Request_Demo1*/
    }
}
