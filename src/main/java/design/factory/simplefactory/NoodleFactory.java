package design.factory.simplefactory;

/**
 * Created by Emma on 2018/8/10.
 */

/*
* 做面条的工厂类
* */
public class NoodleFactory {
    public Noodle makeNoodles(int money){
        Noodle noodle=null;
        if (money==5){
            noodle= new PaoNoodles();
        }
        else if (money==10){
            noodle= new LanzouNoodles();
        }
        return noodle;
    }
}
