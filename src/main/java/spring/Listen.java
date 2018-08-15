package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */

@Component("listen")//可以不指定名称，有默认
public class Listen {
    @Autowired
    private Client client;

    private Listen(){
    }
    /*设及到工厂方法
    * */
    public static Listen getInstance(){
        return  new Listen();
    }
}
