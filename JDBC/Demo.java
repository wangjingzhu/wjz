package cn.itcast.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");    //DriverManager注册驱动       //DriverManager.getConnection获取数据库连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/heima", "root", "root");
        String sql = "update heima01 set age = 20 where id = 1";
        Statement stmt = conn.createStatement();    //获取执行sql对象
        long count = stmt.executeLargeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();
    }

}
