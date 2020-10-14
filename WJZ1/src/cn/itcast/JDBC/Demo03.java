package cn.itcast.JDBC;

import java.sql.*;

public class Demo03 {
    public static void main(String[] args)  {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from heima01";
            conn = DriverManager.getConnection("jdbc:mysql:///heima","root","root");
            stat = conn.createStatement();
            rs = stat.executeQuery(sql);
            while(rs.next()){
                int Int = rs.getInt(1);
                String string = rs.getString(2);
                int int1 = rs.getInt(4);
                System.out.println(Int+string+int1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                try {
                    rs.close();
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
