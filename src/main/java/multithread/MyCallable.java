package multithread;

import java.util.concurrent.Callable;

/**
 * Created by Emma on 2018/8/7.
 */

/*
* 1. 创建一个类实现Callable接口，实现call方法。这个接口类似于Runnable接口，但比Runnable接口更加强大，增加了
* 异常和返回值。
*2. 创建一个FutureTask，指定Callable对象，做为线程任务。
*3. 创建线程，指定线程任务。
*4. 启动线程
* */
public class MyCallable implements Callable<String>{
    String name;

    public MyCallable(String name){
        this.name=name;
    }

    @Override
    public synchronized String call() throws Exception {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" is running....");
                Thread.sleep(1000);

        }
        return this.name;
    }
}
