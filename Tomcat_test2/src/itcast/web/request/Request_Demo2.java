package itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Request_Demo2")
public class Request_Demo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        * 获取请求头的重要方法  getHeader  getheadernames */
/*        Enumeration<String> headerNames = request.getHeaderNames();   //Enumeration类型迭代器
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            String value = request.getHeader(name);
            System.out.println(name+"---"+value);
        }*/
        String header = request.getHeader("user-agent");               //获取请求头 user-agent
        if(header.contains("IE")){
            System.out.println("IE来了！");
        }else if(header.contains("Edg")){
            System.out.println("Edg来了！");
        }
    }
}
