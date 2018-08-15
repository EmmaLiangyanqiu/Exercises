package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class IntelFactory extends AbstractFactory {
    @Override
    Cpu createCpu() {
        return new IntelCpu(567);
    }

    @Override
    MainBoard createMainBoard() {
        return new IntelMainBoard(567);
    }
}
