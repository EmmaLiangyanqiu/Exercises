package design.adapter.classadapter;

/**
 * Created by Emma on 2018/8/9.
 */

/* 源类，我们需要这个类实现接口  TargetInterface，但这个类不能被改变
 * 源类与接口之间是没有关系的
 *
* */
public class BeaAdapted  {
    public void method1() {
        System.out.println("实现方法一");
    }
}
