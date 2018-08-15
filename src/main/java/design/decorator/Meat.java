package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class Meat extends Food {
    Food basicFood;

    public Meat(Food basicFood){
        this.basicFood=basicFood;
    }
    @Override
    public String getAll() {
        return basicFood.getAll()+this.getFoodName();
    }
}
