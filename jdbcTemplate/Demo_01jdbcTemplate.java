package cn.itcast.jdbcTemplate;

import com.alibaba.druid.pool.DataSourceClosedException;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;
/*Spring框架中的JdbcTemplate
* */
public class Demo_01jdbcTemplate {
    public static void main(String[] args) throws Exception {
        /*Properties pro = new Properties();
        pro.load(Demo_01jdbcTemplate.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);*/
        JdbcTemplate template = new JdbcTemplate(JDBCUtils_Druid.getDataSource());
        String sql = "update account set balance = 5000 where id = ?";
        int i = template.update(sql, 4);
        System.out.println(i);

    }
}
