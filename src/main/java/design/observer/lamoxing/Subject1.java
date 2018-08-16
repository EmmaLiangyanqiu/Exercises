package design.observer.lamoxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma on 2018/8/16.
 */
public abstract class Subject1 {
    private List<Observe1> observeList=new ArrayList<Observe1>();

    public void register(Observe1 observe){
        observeList.add(observe);
        System.out.println("add observe");
    }
    public void delete(Observe1 observe){
        observeList.remove(observe);
    }

    public void notifyObserve(){
        for (Observe1 observe:observeList){
            observe.update(this);
        }
    }

}
