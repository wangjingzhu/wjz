package cn.itcast.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stat = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into heima01 value(null,'娃子',12,8.5)";
             conn = DriverManager.getConnection("jdbc:mysql:///heima","root","root");
             stat = conn.createStatement();
            long l = stat.executeLargeUpdate(sql);
            System.out.println(l);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (stat != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
