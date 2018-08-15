package spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */
@Component
public class Handler {
    @EventListener
    public void hand(HelloEvent event){
        System.out.println("hhh"+event.getName());
    }
}
