package itcast.web.LX.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
* JDBC工具类 获取Durid连接池*/
public class JDBC_Util {
    private static DataSource ds;

    static {
        try {
            Properties pro = new Properties();
            InputStream is = JDBC_Util.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);    //获取连接池对象
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DataSource getDataSource(){         //获取dataSource连接池工具接口
        return ds;
    }
    public static Connection getConnection() throws SQLException {   //获取连接
        return ds.getConnection();
    }
}
