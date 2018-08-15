package spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Created by Emma on 2018/8/15.
 */
public class ApplicationMail {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("收件人：");
        String receivename=input.nextLine();
        System.out.print("主题：");
        String title=input.next();
        System.out.print("内容：");
        String context=input.next();

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc.xml");
        ApplicationEventPublisher applicationEventPublisher=applicationContext;
        applicationEventPublisher.publishEvent(new MailEvent(new ApplicationMail(),receivename,title,context));
    }
}
