package design.factory.abstractfactory;

/**
 * Created by Emma on 2018/8/10.
 */
public class IntelMainBoard implements MainBoard {
    private int hole;

    public IntelMainBoard(int hole){
        this.hole=hole;
    }
    @Override
    public void installCpu() {
        System.out.println("Intel 的插槽数为"+hole);
    }
}
