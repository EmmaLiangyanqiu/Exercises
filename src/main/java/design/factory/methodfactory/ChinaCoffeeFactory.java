package design.factory.methodfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class ChinaCoffeeFactory extends CoffeeFactory {
    @Override
    Coffee[] getCoffee() {
        return new Coffee[]{new Cappuccino(),new Latte()};
    }
}
