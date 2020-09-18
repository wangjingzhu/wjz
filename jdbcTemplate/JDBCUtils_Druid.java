package cn.itcast.jdbcTemplate;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Properties;

/*
* Druid连接池的工具类*/
public class JDBCUtils_Druid {
    private static DataSource ds;
    static {
        Properties pro = new Properties();
        try {
            pro.load(JDBCUtils_Druid.class.getClassLoader().getResourceAsStream("druid.properties"));
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
    }
    public static void close(Statement stmt,Connection conn){
        close(null,stmt,conn);
    }
    public static void close(ResultSet res, Statement stmt, Connection conn){
        if (res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static DataSource getDataSource(){  //getDataSource = DruidDataSourceFactory.createDataSource();
        return ds;
    }
}
