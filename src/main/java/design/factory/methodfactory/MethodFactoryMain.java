package design.factory.methodfactory;

/**
 * Created by Emma on 2018/8/10.
 */

/*
*
* 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到了子类。
* 场景延伸：不同地区咖啡工厂受制于环境、原料等因素的影响，制造出的咖啡种类有限。
* 中国咖啡工厂仅能制造卡布奇诺、拿铁，而美国咖啡工厂仅能制造美式咖啡、拿铁。
* 本质是对工厂抽象，由它的子类来实现（工厂方法模式针对的是一个产品等级结构）
*
* 在上述的场景上继续延伸：咖啡工厂做大做强，引入了新的饮品种类：茶、 碳酸饮料。中国工厂只能制造咖啡和茶，
* 美国工厂只能制造咖啡和碳酸饮料。如果用工厂方法方式，
* 除去对应的产品实体类还需要新增2个抽象工厂（茶制造工厂、碳酸饮料制造工厂），4个具体工厂实现。
* 随着产品的增多，会导致类爆炸。因此引入抽象工厂模式
*
*
* */
public class MethodFactoryMain {
    public static void main(String[] args) {
        CoffeeFactory china=new ChinaCoffeeFactory();
        Coffee chinaCoffe[]=china.getCoffee();
        System.out.println("中国有：");
        print(chinaCoffe);


        CoffeeFactory america=new AmericaCoffeeFactory();
        Coffee americaCoffee[]=america.getCoffee();
        System.out.println("美国有：");
        print(americaCoffee);
    }
    public static void print(Coffee[] coffees){
        for (Coffee coffee:coffees){
            System.out.println(coffee.getCoffeeName());
        }
    }
}
