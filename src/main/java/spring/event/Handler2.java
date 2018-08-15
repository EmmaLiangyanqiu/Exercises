package spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */
@Component
public class Handler2 {
    @EventListener
    public void hand(HelloEvent event){
        System.out.println("bbb"+ event.getName());
    }
}
