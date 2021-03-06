package cn.itcast.JDBC;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo04_02 {
    public List<Emp> finAll(){
        Connection conn = null;
        Statement stat = null;
        ResultSet res = null;
        List<Emp> list = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "select * from emp";
            conn = DriverManager.getConnection("jdbc:mysql:///db1","root","root");
            stat = conn.createStatement();
            res = stat.executeQuery(sql);
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (res.next()){
                int anInt = res.getInt("id");
                String string = res.getString("ename");
                int anInt1 = res.getInt("job_id");
                int anInt2 = res.getInt("mgr");
                Date date = res.getDate("joindate");
                double double1 = res.getDouble("salary");
                double double2 = res.getDouble("bonus");
                int anInt3 = res.getInt("dept_id");
                emp = new Emp();
                emp.setId(anInt);
                emp.setEname(string);
                emp.setJob_id(anInt1);
                emp.setMgr(anInt2);
                emp.setJoindate(date);
                emp.setSalary(double1);
                emp.setBonus(double2);
                emp.setDept_id(anInt3);
                list.add(emp);

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
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    public static void main(String[] args)  {
        List<Emp> list = new Demo04_02().finAll();
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
}
