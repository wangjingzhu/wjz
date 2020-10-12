package itcast.web.Response;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet( "/downLoadServlet")
public class downLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        ServletContext context = this.getServletContext();
        String realPath = context.getRealPath("/img/" + filename);

        FileInputStream fis = new FileInputStream(realPath);

        String mimeType = context.getMimeType(filename);
        response.setHeader("content-type",mimeType);

        String agent = request.getHeader("user-agent");      //解决图片中文名问题，设置请求头
        String fileName = DownLoadUtils.getFileName(agent, filename);

        response.setHeader("content-disposition","attachment;filename"+filename);

        ServletOutputStream sos = response.getOutputStream();
        byte[] bytes = new byte[1024 * 8];
        int len = 0 ;
        while ((len=fis.read(bytes)) != -1){
            sos.write(bytes,0,len);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
