package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Man man=new Man();

        ManDecoratorA manDecoratorA=new ManDecoratorA();
        ManDecoratorB manDecoratorB=new ManDecoratorB();
        manDecoratorA.setPerson(man);
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
    }
}
