package spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */
/*
* 事件
*   事件的
* */
public class HelloEvent extends ApplicationEvent {
    @Autowired
    private  String name;
    public HelloEvent(final Object source,String name){
        super(source);
        this.name=name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
