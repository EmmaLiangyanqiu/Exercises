package design.singleton;

/**
 * Created by Emma on 2018/8/7.
 */
public class HungrySingleton {
    /*
    *  类加载时直接实例化
    * */
    private static HungrySingleton singleton=new HungrySingleton();

    /*
    *  类加载时直接实例化
    * */
    private HungrySingleton(){
    }

    /*
    * 公有获取实例
    * */
    public  HungrySingleton getSingleton(){
    return singleton;
    }
}
