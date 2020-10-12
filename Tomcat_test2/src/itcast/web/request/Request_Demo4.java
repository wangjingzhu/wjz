package itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/Request_Demo4")
public class Request_Demo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post获取请求参数
        request.setCharacterEncoding("utf-8");                  //setCharacterEncoding 防止post提交中文乱码
        String username = request.getParameter("username");   //getParameter根据参数名称获取参数值
        System.out.println(username);
        String[] parameterValues = request.getParameterValues("hobby");//getParameterValues根据参数名称获取参数值的数组
        System.out.println(parameterValues);
        Enumeration<String> parameterNames = request.getParameterNames();//getParameterNames根据参数名称获取所有参数值
        while (parameterNames.hasMoreElements()){                      //复选框重复的hobby只获取一个
            String name = parameterNames.nextElement();
            String value = request.getParameter(name);
            System.out.println(name+"----"+value);
        }
        Map<String, String[]> parameterMap = request.getParameterMap();//getParameterMap根据参数名称获取所有参数值
        Set<String> keySet = parameterMap.keySet();                     //复选框重复的hobby都可以获取存放在Map<String, String[]>
        for (String name : keySet) {
            String[] vlues = parameterMap.get(name);
            for (String vlue : vlues) {
                System.out.println(name+"::"+vlue);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get获取请求参数
        this.doPost(request,response);
        /*get方式不会中文乱码
        * post会中文乱码 ，所以在post中要setCharacterEncoding设置*/
    }
}
