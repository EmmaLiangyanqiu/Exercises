package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public abstract class AbstractFactory {
    abstract Cpu createCpu();
    abstract MainBoard createMainBoard();
}
