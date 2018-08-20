package design.dynamic_proxy;



/**
 * Created by Emma on 2018/8/17.
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void getMoney() {
        try{
            //数钱花了一分钟
          Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name+"交了班费");
    }
}
