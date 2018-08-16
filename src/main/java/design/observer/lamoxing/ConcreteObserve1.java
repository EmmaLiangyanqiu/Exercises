package design.observer.lamoxing;


/**
 * Created by Emma on 2018/8/16.
 */
public class ConcreteObserve1 implements Observe1 {
    private String observeState;
    @Override
    public void update(Subject1 subject) {
      this.observeState=((ConcreteSubject1)subject).getState();
        System.out.println("这个观察者的状态为:"+observeState);
    }
}
