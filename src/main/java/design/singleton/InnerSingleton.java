package design.singleton;

/**
 * Created by Emma on 2018/8/9.
 */

/*
* 内部类实现单例，同样使用classloader实现单例，避免多线程问题，优点：将实例化交给内部类去实现，
* 只有显示地调用get方法时，才会去初始化实例，达到lazy loading
* */
public class InnerSingleton {

    /* 静态内部类初始化单例
    * */
    private static class singlrtonHolder {
        private final static InnerSingleton innersingleton = new InnerSingleton();
    }

    /*
    * 无参构造私有化
    * */
    private InnerSingleton() {
    }

    /*
    * 返回内部类的实例
    * */
    public static final InnerSingleton getInnerSingleton() {
        return singlrtonHolder.innersingleton;
    }
}

