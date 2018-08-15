package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class IntelCpu implements Cpu {
    private int pin;

    public IntelCpu(int pin){
        this.pin=pin;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU 的针脚为："+pin);
    }
}
