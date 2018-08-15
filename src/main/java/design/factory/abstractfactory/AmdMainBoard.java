package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class AmdMainBoard implements MainBoard {
    private int hole;
    public AmdMainBoard(int hole){
        this.hole=hole;
    }
    @Override
    public void installCpu() {
        System.out.println("Amd 插槽数为："+hole);
    }
}
