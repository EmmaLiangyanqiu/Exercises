package reflect;

import java.lang.reflect.Field;

/**
 * Created by Emma on 2018/8/9.
 */
public class ReflectMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("李四");
        String str = "name";

        getParentField(student, str);
    }

    //获取父类属性
    public static void getParentField(Student student, String name) {
        try {
            Class parent = student.getClass().getSuperclass();
            People p = (People) parent.newInstance();
            p.setName("黄金圣斗士");
            Field field = parent.getDeclaredField(name);
            field.setAccessible(true);
            Object obj = field.get(p);
            System.out.println("父类名："+obj.toString());


            Class parent1 = student.getClass().getSuperclass().getSuperclass();
            Animal animal = (Animal) parent1.newInstance();
            animal.setName("熊猫");
            Field field1=parent1.getDeclaredField(name);
            field1.setAccessible(true);
            Object obj1=field1.get(animal);
            System.out.println("父父类名："+obj1.toString());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

}
