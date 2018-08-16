package design.observer.tuimoxing;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma on 2018/8/16.
 */
public abstract class Subject {
    private List<Observe> observeList=new ArrayList<Observe>();

    public void register(Observe observe){
        observeList.add(observe);
        System.out.println("add observe");
    }
    public void delete(Observe observe){
        observeList.remove(observe);
    }
    public void notifyObserve(String state){
        for (Observe observe:observeList){
            observe.update(state);
        }
    }

}
