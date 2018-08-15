package spring.event;

import design.factory.abstractfactory.MainBoard;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Emma on 2018/8/15.
 */
public class MailEvent extends ApplicationEvent{
    private String title;
    private String receivename;
    private String context;

    public MailEvent(final Object source ,String receivename,String title,String context){
        super(source);
        this.title=title;
        this.receivename=receivename;
        this.context=context;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
