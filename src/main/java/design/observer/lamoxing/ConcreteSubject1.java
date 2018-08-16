package design.observer.lamoxing;

/**
 * Created by Emma on 2018/8/16.
 */
public class ConcreteSubject1 extends Subject1 {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        state=newState;
        System.out.println("大减价！！！");
        this.notifyObserve();
    }
}
