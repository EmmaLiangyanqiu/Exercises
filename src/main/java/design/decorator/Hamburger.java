package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class Hamburger {
    public static void main(String[] args) {
        Food food=new Food("面包");
        Meat meat=new Meat(food);
        meat.setFoodName("培根");
        Vegetable vegetable=new Vegetable(meat);
        vegetable.setFoodName("蔬菜");
        Flavor flavor=new Flavor(vegetable);
        flavor.setFoodName("配料");

        System.out.println("汉堡包由"+" "+flavor.getAll());
    }
}
