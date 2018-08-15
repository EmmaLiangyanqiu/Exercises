package multithread;

/**
 * Created by Emma on 2018/8/7.
 */
public class MyRunnable implements Runnable {
    String name;

    public MyRunnable(String name){
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {

        } {
            System.out.println(Thread.currentThread().getName() + " is running....");
            try {
                if("myRunnable1".equals(this.name)){
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
