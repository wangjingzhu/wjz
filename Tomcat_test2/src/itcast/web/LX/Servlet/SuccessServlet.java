package itcast.web.LX.Servlet;

import itcast.web.LX.dao.UserDao;
import itcast.web.LX.domai.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = (User) request.getAttribute("user");   //获取request域中的共享的user对象

        if (user!=null){
            response.setContentType("text/html;charset=utf-8");  //给页面写一句话，设置编码
            response.getWriter().write("登录成功,"+user.getUsername()+"用户欢迎你！！");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
