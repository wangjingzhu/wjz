package cn.itcast.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stat =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "create table heima02(id int,name char,telephone int)";
            conn = DriverManager.getConnection("jdbc:mysql:///heima", "root", "root");
            stat = conn.createStatement();
            int i = stat.executeUpdate(sql);
            System.out.println(i);
            if (i == 0){
                System.out.println("创建成功");
            }else{
                System.out.println("创建失败");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
