package reflect;

/**
 * Created by Emma on 2018/8/9.
 */
public class People extends Animal{
    private String name;
    private String sex;

    @Override
    public String getName() {
        return name;
    }
@Override
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
@Override
    public String say(String words){
        return "people say"+words;
    }
}
