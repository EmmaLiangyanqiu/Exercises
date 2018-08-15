package multithread;

/**
 * Created by Emma on 2018/8/7.
 */
public class MyThread extends Thread{
     private String name;

     public MyThread(String name){
         this.name=name;
     }
    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"  is running...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
