package design.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Emma on 2018/8/17.
 */
public class StuInvocationHandler implements InvocationHandler {
    Person person;

    public StuInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法");
        Monitorutil.start();
        Object result=method.invoke(person,args);
        Monitorutil.finish(method.getName());

        return result;
    }
}
