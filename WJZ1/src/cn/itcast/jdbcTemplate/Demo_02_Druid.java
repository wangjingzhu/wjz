package cn.itcast.jdbcTemplate;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
//用自定义的工具类
//Druid中DruidDataSourceFactory数据库连接池对象
public class Demo_02_Druid {
 public static void main(String[] args) {
     Connection conn = null;
     PreparedStatement pre = null;
     try {
         conn = JDBCUtils_Druid.getConnection();
         String sql = "insert into account value(null,?,?)";
         pre = conn.prepareStatement(sql);
         pre.setString(1,"wangwu");
         pre.setInt(2,2000);
         int i = pre.executeUpdate();
         System.out.println(i);
     } catch (Exception e) {
         e.printStackTrace();
     }finally {
         JDBCUtils_Druid.close(pre,conn);
     }
 }
}
