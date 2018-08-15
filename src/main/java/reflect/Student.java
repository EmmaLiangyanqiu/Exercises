package reflect;

/**
 * Created by Emma on 2018/8/9.
 */
public class Student extends People {

    @Override
    public String say(String words) {
        return super.say("student say" + words);
    }
}
