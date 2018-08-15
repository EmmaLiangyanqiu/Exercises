package design.singleton;

/**
 * Created by Emma on 2018/8/9.
 */

//懒汉式单例模式：在类加载时不初始化。
//优点：lazy loading，缺点：效率低
public class LazySingleton {
    /*
    * 声明静态全局变量
    * */
    private static LazySingleton lazySingleton;

    /*
    *  将无参构造声明为私有方法，禁止通过无参构造创建实例
    * */
    public LazySingleton() {
    }

     /*
    *获取单例，利用synchronized解决多线程问题，效率低
     */

    public static synchronized LazySingleton getLazySingleton() {
        if (lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }


}
