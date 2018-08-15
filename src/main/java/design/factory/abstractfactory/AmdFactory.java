package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class AmdFactory extends AbstractFactory {
    @Override
    Cpu createCpu() {
        return new AmdCpu(478);
    }

    @Override
    MainBoard createMainBoard() {
        return new AmdMainBoard(478);
    }
}
