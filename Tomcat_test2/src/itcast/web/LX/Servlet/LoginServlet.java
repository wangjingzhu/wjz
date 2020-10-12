package itcast.web.LX.Servlet;

import itcast.web.LX.dao.UserDao;
import itcast.web.LX.domai.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
 /*       String username = request.getParameter("username");   //获取请求参数
        String password = request.getParameter("password");
        User loginuser = new User();                           //封装user对象
        loginuser.setUsername(username);
        loginuser.setPassword(password);*/
        Map<String, String[]> map = request.getParameterMap();  //获取请求参数存放在map集合中
        User loginuser = new User();
        try {
            BeanUtils.populate(loginuser,map);            // BeanUtils工具类的populate封装属性值方法,
        } catch (IllegalAccessException e) {              // 把map集合获取的值封装到javabean对象里
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        UserDao dao = new UserDao();            //调用userdao方法login
        User user = dao.login(loginuser);
        if (user==null){
            request.getRequestDispatcher("/FailServlet").forward(request,response); //登录失败跳转转发
        }else {
            request.setAttribute("user",user);              //登录成功存储数据
            request.getRequestDispatcher("/SuccessServlet").forward(request,response); //登录成功跳转转发
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
