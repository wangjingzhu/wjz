package itcast.web.Response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.io.IOException;
import java.util.Random;

@WebServlet("/CheckCodeServlet")
public class CheckCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int with = 100;
        int heigth = 50;
        //1创建一对象，在内存中图片（验证码图片对象）
        BufferedImage image = new BufferedImage(with,heigth, BufferedImage.TYPE_INT_RGB);
        //2美化图片
        //2.1填充背景色
        Graphics g = image.getGraphics();//设置画笔对象
        g.setColor(Color.pink);         //设置画笔颜色
        g.fillRect(0,0,with,heigth);
        //2.2边框
        g.setColor(Color.blue);
        g.drawRect(0,0,with-1,heigth-1);
        //2.3写验证码
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random ran = new Random();
        for (int i = 1; i <=4 ; i++) {
            int index = ran.nextInt(str.length()); //随机角标
            char ch = str.charAt(index);           //随机字符
            g.drawString(ch+"",with/5*i,heigth/2);
        }
        //2.4画干扰线
        g.setColor(Color.green);
        for (int i = 0; i < 10 ; i++) {
            int x1 = ran.nextInt(with);
            int x2 = ran.nextInt(with);
            int y1 = ran.nextInt(heigth);
            int y2 = ran.nextInt(heigth);
            g.drawLine(x1,y1,x2,y2);
        }

        //3将内存中的图片输出到页面展示
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
