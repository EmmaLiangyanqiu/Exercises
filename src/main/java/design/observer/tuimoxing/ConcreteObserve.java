package design.observer.tuimoxing;



/**
 * Created by Emma on 2018/8/16.
 */
public class ConcreteObserve implements Observe {
    private String observeState;
    @Override
    public void update(String state) {
      this.observeState=state;
        System.out.println("这个观察者的状态为:"+state);
    }
}
