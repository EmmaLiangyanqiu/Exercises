package design.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Emma on 2018/8/17.
 */
public class Dynamic_ProxyMain {
    public static void main(String[] args) {
     Person person=new Student("张三");
        InvocationHandler stuInvocationHandler=new StuInvocationHandler(person);
        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person stuProxy= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class},stuInvocationHandler);

        stuProxy.getMoney();

    }
}
