package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class Vegetable extends Food {
    Food basicFood;

    public Vegetable(Food basicFood){
        this.basicFood=basicFood;
    }
    @Override
    public String getAll() {
        return basicFood.getAll()+this.getFoodName();
    }
}
