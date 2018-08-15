package design.decorator;

/**
 * Created by Emma on 2018/8/10.
 */
public class Food {
    private String foodName;

    public Food(){}
    public Food(String foodName){
        this.foodName=foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getAll(){
        return foodName;
    }
}
