package design.adapter.classadapter;

/**
 * Created by Emma on 2018/8/10.
 */

/* 这是适配器，它接受了BeAdapted中已有的接口并产生我们需要的接口
 * method1()方法继承自BeAdapted类（即已有的接口），不用再作声明
 * 这里适配器的作用相当于为源类与接口之间建立了一种关系，类似于 implements
 *  */
public class Adapter extends BeaAdapted implements TargetInterface{
    @Override
    public void method2() {
        System.out.println("实现方法二");
    }
}
