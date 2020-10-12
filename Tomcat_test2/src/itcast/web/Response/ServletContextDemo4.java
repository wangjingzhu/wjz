package itcast.web.Response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo4")
public class ServletContextDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        //获取文件的真实路径（服务器路径）
        String realPath = context.getRealPath("/a.txt");  //web路径下
        System.out.println(realPath);  //E:\Program Files\IDEA2020\WJZ3\out\artifacts\Tomcat_test2_war_exploded2\a.txt
        /*     web路径下:getRealPath("/a.txt");
          WEB-INF路径下:getRealPath("/WEB-INF/a.txt");
             src路径下:getRealPath("/WEB-INF/classes/a.txt");*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
