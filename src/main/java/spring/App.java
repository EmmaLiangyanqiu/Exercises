package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import spring.dao.UserDao;
import spring.entity.User;
import spring.event.HelloEvent;

import java.util.List;

/**
 * Created by Emma on 2018/8/15.
 */

/*
* IOC依赖注入普通的方法：
* set
* 构造器
* 工厂方法
* */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        //System.out.println(applicationContext.getBean("listen"));
        //ApplicationEventPublisher applicationEventPublisher=applicationContext;
        //applicationEventPublisher.publishEvent(new HelloEvent(new App(),"hand"));

        //测试对数据库的操作
         UserDao userDao= (UserDao) applicationContext.getBean("userDao");
         userDao.queryAll();


    }}


