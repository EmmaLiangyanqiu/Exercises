package design.observer.lamoxing;



/**
 * Created by Emma on 2018/8/16.
 */
public class Client {
    public static void main(String[] args) {
       ConcreteSubject1 concreteSubject1=new ConcreteSubject1();
        Observe1 observe1=new ConcreteObserve1();
        concreteSubject1.register(observe1);
        concreteSubject1.change("on sale");
    }
}
