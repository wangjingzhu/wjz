package cn.itcast.jdbcTemplate;


import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Demo_02jdbcTemplate {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils_Druid.getDataSource());
    @Test
    public void test1(){
        String sql = "update emp1 set salary = 10000 where id = ?";
        int i = template.update(sql, 1001);
        System.out.println(i);
    }
    @Test
    public void test2(){
        String sql = "insert into emp(id,ename,dept_id) values(?,?,?)";
        int i = template.update(sql, 1015, "郭靖", 10);
        System.out.println(i);
    }
    @Test
    public void test3(){
        String sql = "delete from emp where id = ?";
        int i = template.update(sql, 1015);
        System.out.println(i);
    }
    /*.queryForMap方法把结果集封装到map集合
     查询的结果集长度只能为1 * */
    @Test
    public void test4(){
        String sql = "select * from emp where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1001);
        System.out.println(map);
        //{id=1001, ename=孙悟空, job_id=4, mgr=1004, joindate=2000-12-17, salary=8000.00, bonus=null, dept_id=20}
    }
    /*queryForList方法将每一个结果集封装到List集合
    * 结果集每一个封装为map集合，在把map集合封装到list集合*/
    @Test
    public void test5(){
        String sql = "select * from emp";
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> list1 : list) {
            System.out.println(list1);
        }
    }
   /* @Test
    public void test6(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp();
                int id = emp.getId("id");
                String ename = emp.getEname("ename");
                int job_id = emp.getJob_id("job_id");
                int mgr = emp.getMgr("mgr");
                Date joindate = emp.getJoindate("joindate");
                double salary = emp.getSalary("Salary");
                double bonus = emp.getBonus("bonus");
                int dept_id = emp.getDept_id("dept_id");
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setMgr(mgr);
                emp.setJob_id(job_id);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                return emp;
            }
        });
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }*/
   /*query中new RowMapper封装javabean
   * new BeanPropertyRowMapper则是自动封装javabean*/
    @Test
    public void test7(){
        String sql = "select * from emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
    /*queryForObject一般查询聚合函数*/
    @Test
    public void test8(){
        String sql = "select count(id) from emp";
        Long aLong1 = template.queryForObject(sql, Long.class);
        System.out.println(aLong1);
    }
}
