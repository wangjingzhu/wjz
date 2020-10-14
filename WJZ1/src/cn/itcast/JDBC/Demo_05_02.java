package cn.itcast.JDBC;

import java.sql.*;
import java.util.Scanner;

/*使用prepareStatement防止sql注入（密码 a' or 'a' = 'a）  更加安全
* 登录练习
* */
public class Demo_05_02 {
    public static boolean login(String username,String password){
        if (username==null||password==null){
            return false;
        }
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet res = null;
        try {
            conn = Demo_JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ? ";
            pre = conn.prepareStatement(sql);
            pre.setString(1,username);
            pre.setString(2,password);
            res = pre.executeQuery();
            /*if (res.next()){
                return true;
            }else {
                return false;
            }*/
            return res.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Demo_JDBCUtils.close(res,pre,conn);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名： ");
        String username = scanner.nextLine();
        System.out.println("请输入密码： ");
        String password = scanner.nextLine();
        boolean flag = login(username, password);
        if (flag==true){
            System.out.println("登陆成功！");
        }else {
            System.out.println("用户名或密码登录失败！");
        }
    }
}
