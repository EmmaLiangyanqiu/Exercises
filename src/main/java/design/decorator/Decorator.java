package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public abstract class Decorator implements Person {
    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        person.eat();
    }
}
