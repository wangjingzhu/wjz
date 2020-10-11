package cn.test.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /*
    * 监听ServletContext对象创建时，ServletContext对象服务器启动后自动创建*/
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被创建了。");
    }
/*
*  服务器关闭时，servletContext对象被销毁。服务器关闭后该方法被调用*/
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象被销毁了");
    }
}
