package design.singleton;

/**
 * Created by Emma on 2018/8/9.
 */


/*
*这种方式是Effective Java作者Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
* 而且还能防止反序列化重新创建新的对象，可谓是很坚强的壁垒啊，
 */

public  enum EnumSingleton {
    instance;
}
