package design.observer.tuimoxing;

/**
 * Created by Emma on 2018/8/16.
 */
public class ConcrectSubject extends Subject {
    String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        this.state=newState;
        System.out.println("状态更改为"+state);
        this.notifyObserve(newState);
    }
}
