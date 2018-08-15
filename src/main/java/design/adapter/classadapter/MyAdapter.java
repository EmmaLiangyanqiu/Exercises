package design.adapter.classadapter;

/**
 * Created by Emma on 2018/8/9.
 */

public class MyAdapter extends ThreeHoleImpl implements TwoHole {
    @Override
    public void userTwoHole() {
        useThreeHole();
    }

}
