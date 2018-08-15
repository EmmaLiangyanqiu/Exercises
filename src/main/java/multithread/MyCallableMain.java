package multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Created by Emma on 2018/8/7.
 */
public class MyCallableMain {
    public static void main(String[] args) {
        MyCallable myCallable1 = new MyCallable("myCallable1");
        MyCallable myCallable2 = new MyCallable("myCallable2");
        MyCallable myCallable3 = new MyCallable("myCallable3");

    /*     FutureTask关系到分支线程的返回和异常，与主线程关联起来，.get方法等待线程的执行完毕，同时分
    支线程的异常也会被主线程捕获到
*/
        FutureTask<String> task1 = new FutureTask<String>(myCallable1);
        FutureTask<String> task2 = new FutureTask<String>(myCallable2);
        FutureTask<String> task3 = new FutureTask<String>(myCallable3);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            System.out.println(task1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
