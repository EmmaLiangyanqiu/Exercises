package design.adapter.classadapter;

/**
 * Created by Emma on 2018/8/9.
 */

/*
* 这是类适配器
*
* 有两孔的需要三孔插座，做一个适配器来实现两孔方法继承三孔的类
* 三孔的方法要实现类，而两孔的实现类则是继承适配器
*
* */
public class AdapterMain {
    public static void main(String[] args) {
        TwoHole twoHole=new MyAdapter();
        twoHole.userTwoHole();
    }
}
