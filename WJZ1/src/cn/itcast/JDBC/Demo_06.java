package cn.itcast.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo_06 {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement pre1 =null;
        PreparedStatement pre2 =null;
        try {
            conn = Demo_JDBCUtils.getConnection();
            conn.setAutoCommit(false);       //开启事务
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
            pre1 = conn.prepareStatement(sql1);     //prepareStatement动态sql
            pre2 = conn.prepareStatement(sql2);
            pre1.setInt(1,500);
            pre1.setInt(2,1);
            pre2.setInt(1,500);
            pre2.setInt(2,2);
            pre1.executeUpdate();
            int i =3/0;      //制造异常
            pre2.executeUpdate();
            conn.commit();   //提交事务
        } catch (Exception e) {
            try {
                if (conn!=null){
                    conn.rollback();  //事务回滚
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            Demo_JDBCUtils.close(pre1,conn);
            Demo_JDBCUtils.close(pre2,null);
        }

    }
}
