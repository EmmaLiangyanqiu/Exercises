package design.observer.tuimoxing;



/**
 * Created by Emma on 2018/8/16.
 */
public class Client {
    public static void main(String[] args) {
        ConcrectSubject concrectSubject=new ConcrectSubject();
        Observe observe=new ConcreteObserve();
        concrectSubject.register(observe);
        concrectSubject.notifyObserve("on sale!!");
    }
}
