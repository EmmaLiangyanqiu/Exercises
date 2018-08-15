package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class AmdCpu implements Cpu {
    private int pin;
    public AmdCpu(int pin){
        this.pin=pin;
    }

    @Override
    public void calculate() {
        System.out.println("Amd CPU的针脚为："+pin);
    }
}
