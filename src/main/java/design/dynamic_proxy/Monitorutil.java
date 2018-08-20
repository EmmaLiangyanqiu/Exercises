package design.dynamic_proxy;

/**
 * Created by Emma on 2018/8/17.
 */
public class Monitorutil {
   private static ThreadLocal<Long> t1=new ThreadLocal<>();
   public static void start(){
       t1.set(System.currentTimeMillis());
   }
   public static void finish(String methodName){
       //打印耗时多少
       long finishTime=System.currentTimeMillis();
       System.out.println(methodName+"花费了："+(finishTime-t1.get())+"ms");
   }
}
