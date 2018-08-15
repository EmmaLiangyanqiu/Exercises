package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Emma on 2018/8/15.
 */
@Component

public class Client {
    @Autowired  //构造函数需要传参就加这个注解 没有set的方法的注入
    public Client(){}
}
