package cn.itcast.jdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
//c3p0中ComboPooledDataSource连接池对象
public class Demo01_C3p0 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource();
        DataSource ds2 = new ComboPooledDataSource("otherc3p0");
        for (int i = 1; i <= 11; i++) {
            Connection cpmm = ds.getConnection();
            System.out.println(i+":"+cpmm);
            if (i==5){
                cpmm.close();
            }
        }
        for (int i = 1; i <=9 ; i++) {
            Connection cpmm2 = ds2.getConnection();
            System.out.println(i+":"+cpmm2);
        }
    }
}
