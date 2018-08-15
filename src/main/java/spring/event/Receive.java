package spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */
@Component
public class Receive {
    @EventListener
    public void receive(MailEvent event){
        System.out.println("我是第一个处理");
        System.out.println("接收：");
        System.out.println(event.getTitle());
        System.out.println(event.getContext());
    }
}
