package itcast.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/Request_Demo5")
public class Request_Demo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发到demo6
   /*     RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Request_Demo6");
        requestDispatcher.forward(request,response);*/
        request.setAttribute("asd","HELLO");                     //setAttribute方法在requset域转发共享数据
        System.out.println("Demo5被访问了。。。。");
        request.getRequestDispatcher("/Request_Demo6").forward(request,response);   //链式编程语法
        /*
          Demo5被访问了。。。。
          Demo6被访问了！   */
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
