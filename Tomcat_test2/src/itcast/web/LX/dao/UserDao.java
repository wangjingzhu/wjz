package itcast.web.LX.dao;

import itcast.web.LX.domai.User;
import itcast.web.LX.util.JDBC_Util;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/*
* 操作数据库day14表user表的类*/
public class UserDao {
    private JdbcTemplate template = new JdbcTemplate(JDBC_Util.getDataSource());

    public User login(User loginUser){
        try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(),loginUser.getPassword());
            return user;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
