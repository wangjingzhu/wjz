package cn.test.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        boolean flag = false;       //没有cookie为lastTime
        if (cookies!=null && cookies.length>0){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if ("lastTime".equals(name)){          //判断cookie的名称是否为lastTime
                    flag = true;                       //有cookie为lastTime

                    String value = cookie.getValue();  //如果有lastTime，不是第一次访问  先获取vlue，时间
                    System.out.println("解码前："+value);
                    value = URLDecoder.decode(value, "utf-8");    //URL解码
                    System.out.println("解码后："+value);
                    response.getWriter().write("<h1>欢迎回来，上次访问的时间为："+value+"<h1>");

                    Date date = new Date() ;           //设置cookie的value
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);

                    System.out.println("编码前: "+str_date);
                    str_date = URLEncoder.encode(str_date, "utf-8");  //URL编码
                    System.out.println("编码后："+str_date);

                    cookie.setValue(str_date);
                    cookie.setMaxAge(60*60*24*30);     //设置存活时间一个月
                    response.addCookie(cookie);

                    break;
                }
            }
        }
        if (cookies ==null ||cookies.length == 0||flag ==false){    //没有，第一次访问
            Date date = new Date() ;           //设置cookie的value
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);

            System.out.println("编码前: "+str_date);
            str_date = URLEncoder.encode(str_date, "utf-8");  //URL编码
            System.out.println("编码后："+str_date);

            Cookie cookie = new Cookie("lastTime",str_date);
            cookie.setMaxAge(60*60*24*30);     //设置存活时间一个月
            response.addCookie(cookie);
            response.getWriter().write("<h1>你好，欢迎你首次访问！<h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
