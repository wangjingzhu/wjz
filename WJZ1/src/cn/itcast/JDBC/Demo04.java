package cn.itcast.JDBC;

import java.math.BigDecimal;
import java.sql.*;

public class Demo04 {
    public static void main(String[] args)  {
        Statement stat = null;
        ResultSet res = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from emp";
            Connection conn = DriverManager.getConnection("jdbc:mysql:///db1","root","root");
            stat = conn.createStatement();
            res = stat.executeQuery(sql);
            while (res.next()){
                int anInt = res.getInt(1);
                String string = res.getString(2);
                int anInt1 = res.getInt(3);
                int anInt2 = res.getInt(4);
                Date date = res.getDate(5);
                BigDecimal bigDecimal = res.getBigDecimal(6);
                BigDecimal bigDecimal1 = res.getBigDecimal(7);
                int anInt3 = res.getInt("dept_id");
                System.out.println(anInt+"--"+string+"--"+anInt1+"--"+anInt2+"--"+date+"--"
                        +bigDecimal+"--"+bigDecimal1+"--"+anInt3);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (res!=null){
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stat!=null){
                try {
                    stat.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
