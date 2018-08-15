package design.factory.methodfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class AmericaCoffeeFactory extends CoffeeFactory {
    @Override
    Coffee[] getCoffee() {
        return new Coffee[]{new Americano(),new Latte()};
    }
}
