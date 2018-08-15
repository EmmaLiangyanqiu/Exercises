package design.adapter.objectadapter;

/**
 * Created by Emma on 2018/8/10.
 */
  /*
    * 静态成员不能用this访问
    *
    * 类的静态成员属性和方法属于类本身，在类加载的时候就会给他们分配内存，可以通过类直接去访问
    * 类的非静态成员属性方法是属于类的对象，只有类的对象（实例化）的时候才会分配内存，通过类的对象访问
    *
    * 在静态方法里访问非静态的非静态的成员是会出错的,在非静态的属性不存在的时候这个静态的方法已经存在了，
    * 访问内存中不存在的变量就会出错，变量只有在内存中才会被访问到
    *
    * 没有显示类的构造器方法为static，但类的构造器就是为static的方法
    *
    *
    *
    * static变量
    * 静态变量与非静态变量的区别：
    *     静态变量是被所有对象共享的，在内存中只有一个副本
    *     非静态是被对象所拥有的，在实例化的时候初始化，存在有多个副本，各对象拥有的副本互不影响
    *static代码块
    *   只会执行一次，只会进行一次初始化的操作都会放在static代码块中
    *
    *
    *
    * */



public class MyAdapter extends BeAdapted implements TargetInterface {

    private static BeAdapted adapted;

    public MyAdapter(BeAdapted beAdapted) {
        adapted = beAdapted;
    }

    @Override
    public void method1() {
        adapted.mehtod1();
    }

    @Override
    public void method2() {
        System.out.println("实现方法二");
    }
}
