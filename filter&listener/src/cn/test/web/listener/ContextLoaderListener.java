package cn.test.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    /*
    * ����ServletContext���󴴽�ʱ��ServletContext����������������Զ�����*/
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext���󱻴����ˡ�");
    }
/*
*  �������ر�ʱ��servletContext�������١��������رպ�÷���������*/
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext����������");
    }
}
