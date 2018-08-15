package reflect;

/**
 * Created by Emma on 2018/8/9.
 */
public class Animal {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String say(String word){
        return "animal say"+word;
    }
}
