package spring.dao;

import design.factory.abstractfactory.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.Listen;
import spring.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma on 2018/8/15.
 */

/*
* query 把resultset转化成Java object
*
* */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;//有很多方法

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;//有很多方法

    /*//事务控制的注解，update需要用到
    @Transactional
    public void query(){
        jdbcTemplate.queryForObject("select * from customer", new RowMapper<User>() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                rs.getString(0);
                return new Listen(this);
            }
        });
        jdbcTemplate.queryForList("select * from info.customer",Listen.class);
        jdbcTemplate.
    }
    @Transactional(rollbackFor = )
    void update(){

    }*/

    /*
    * 查询单个对象
    * */
    public void query(String username) {
        String sql = "select * from user where username=? ";
        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        User user = jdbcTemplate.queryForObject(sql, rowMapper, "李白");
        System.out.println(user);
    }
    /*
    * 查询多个对象
    * */
    public void queryAll() {
        String sql = "select id,username from user";
        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        List<User> users = jdbcTemplate.query(sql, rowMapper);
        for (User user : users) {
            System.out.println(user.getId() + user.getUsername());
        }
    }
    /*
    * 3.查询count、avg、sum等函数返回唯一值:
    * */
    public void testCountQuery(){
        String sql = "select count(*) from user";
        BeanPropertyRowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(result);
    }

    /*
    *4.增删改方法测试:
    * */
    public void testCreate(){
        String sql = "insert into user (username,password) values (?,?)";
        int create = jdbcTemplate.update(sql, new Object[]{"李清照", 255});
        System.out.println(create);
    }
    /*
    * 修改:
    * */
    public void testUpdate(){
        String sql = "update user set username=? , password=? where id=?";
        int update = jdbcTemplate.update(sql, new Object[]{"李白", 256,3});
        System.out.println(update);
    }
    /*
    * 删除
    * */
    public void testDelete(){
        String sql = "delete from user where id=?";
        int delete = jdbcTemplate.update(sql, new Object[]{3});
        System.out.println(delete);
    }
    /*
    * 批量操作
    * */
    public void testBatch(){
        List<Object[]> batchArgs=new ArrayList<Object[]>();
        batchArgs.add(new Object[]{777,888});
        batchArgs.add(new Object[]{666,888});
        batchArgs.add(new Object[]{555,888});
        String sql = "insert into user (username,password) values (?,?)";
        jdbcTemplate.batchUpdate(sql, batchArgs);
    }
    /*
    *具名参数: SQL 按名称(以冒号开头)而不是按位置进行指定. 具名参数更易于维护, 也提升了可读性.
    * 具名参数由框架类在运行时用占位符取代具名参数只在 NamedParameterJdbcTemplate 中得到支持。
    * NamedParameterJdbcTemplate可以使用全部jdbcTemplate方法,除此之外,我们来看看使用它的具名参数案例:
    *
    * 这个案例增加的password字段为null
    * */
    public void testNamedParameter(){
        String sql = "insert into user (username,password) values (:username,:password)";
        User u = new User();
        u.setUsername("555");
        SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(u);
        namedParameterJdbcTemplate.update(sql,sqlParameterSource);
    }
    /*
    *获取新增的主键:NamedParameterJdbcTemplate还新增了KeyHolder类,使用它我们可以获得主键,
    * 类似Mybatis中的useGeneratedKeys。
    * */
    public void testKeyHolder(){
        String sql = "insert into user (username,password) values (:username,:password)";
        User u = new User();
        u.setUsername("555");
        SqlParameterSource sqlParameterSource=new BeanPropertySqlParameterSource(u);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql, sqlParameterSource, keyHolder);
        int k = keyHolder.getKey().intValue();
        System.out.println(k);
    }
}
