package itcast.web.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Response_demo3")
public class Response_demo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*response.setCharacterEncoding("GBK");    //获取流之前默认是IOS-8859-1，需要设置成客户端一样的编码*/
        //response.setHeader("content-type","text/html;charset=utf-8");//告诉客户端服务器发送的编码，建议客户端用相应的编码来解码
        response.setContentType("text/html;charset=utf-8");   //简单的形式设置编码
        PrintWriter pw = response.getWriter();      //获取字符输出流
        pw.write("<h1>你好，Hello!</h>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
