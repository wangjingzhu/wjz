package itcast.web.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Response_demo1")
public class Response_demo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //重定向，自动跳转到demo2
        System.out.println("demo01......");
/*        response.setStatus(302);                                           //设置状态码为302
        response.setHeader("location","/WJZ3/Response_demo2");              //设置响应头location*/

     /*   response.sendRedirect("/WJZ3/Response_demo2");                  //简单的重定向方法1*/
        String contextPath = request.getContextPath();                    //动态获取虚拟目录
        response.sendRedirect(contextPath+"/Response_demo2");          //简单的重定向方法2

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
