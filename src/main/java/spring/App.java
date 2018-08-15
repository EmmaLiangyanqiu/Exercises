package spring;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.event.HelloEvent;

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
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc.xml");
        //System.out.println(applicationContext.getBean("listen"));
        ApplicationEventPublisher applicationEventPublisher=applicationContext;
        applicationEventPublisher.publishEvent(new HelloEvent(new App(),"hand"));
        System.out.println("hello");
    }
}
