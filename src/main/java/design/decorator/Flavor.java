package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class Flavor extends Food {
    private Food basicFood;

    public Flavor(Food basicFood){
        this.basicFood=basicFood;
    }
    @Override
    public String getAll() {
        return basicFood.getAll()+this.getFoodName();
    }
}
