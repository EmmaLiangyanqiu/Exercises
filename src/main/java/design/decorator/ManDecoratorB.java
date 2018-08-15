package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class ManDecoratorB extends Decorator {
    @Override
    public void eat() {
        super.eat();
        System.out.println("=======================");
        System.out.println("ManDecoratorB类");
    }
}
