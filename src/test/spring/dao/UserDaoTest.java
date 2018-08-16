package spring.dao;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Emma on 2018/8/16.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class UserDaoTest {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @org.junit.Test
    public void query() throws Exception {
        System.out.println(jdbcTemplate==null);
        Assert.assertNotNull(jdbcTemplate);
    }

    @org.junit.Test
    public void queryAll() throws Exception {

    }

}