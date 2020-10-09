package cn.test.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie_Demo3")
public class Cookie_Demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("ert","你好");  //tomcat8之后，支持存储中文
        cookie.setMaxAge(20);     //设置cookie的存活时间
        response.addCookie(cookie);
        //setMaxAge(int secods)默认为负数时，浏览器关闭就销毁  正数时，持久化储存   0时，删除cookie信息
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
