package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class ComputerEngineer {
    private Cpu cpu=null;
    private MainBoard mainBoard=null;

    public void makeComputer(AbstractFactory abstractFactory){
        prepareHardwares(abstractFactory);
    }



//这里要去准备CPU和主板的具体实现，为了示例简单，这里只准备这两个
    //可是，装机工程师并不知道如何去创建，怎么办呢？

    //直接找相应的工厂获取
    private void prepareHardwares(AbstractFactory abstractFactory) {
        this.cpu=abstractFactory.createCpu();
        this.mainBoard=abstractFactory.createMainBoard();

        this.mainBoard.installCpu();
        this.cpu.calculate();
    }


}
