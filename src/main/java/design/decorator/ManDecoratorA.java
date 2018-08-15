package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        super.eat();
        reEat();
    }
    public void reEat(){
        System.out.println("再吃一顿");
    }
}
