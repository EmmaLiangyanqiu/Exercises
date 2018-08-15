package multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Emma on 2018/8/7.
 */

/**
 * 创建线程池
 * corePoolSize 核心线程数
 * maximumPoolSize 最大线程数
 * keepAliveTime 线程等待销毁时间
 * TimeUnit 线程等待销毁时间单位
 * Queue 等待队列
 */
public class ThreadPoolMain {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor
                (5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));

        for (int i = 0; i < 15; i++) {
            MyRunnable myRunnable = new MyRunnable("myRunnable" + i);
            threadPool.execute(myRunnable);
        }
        threadPool.shutdown();

        System.out.println("线程池大小：" + threadPool.getPoolSize() + "队列大小：" + threadPool.getQueue().size() +
                "已经完成：" + threadPool.getCompletedTaskCount());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程池大小：" + threadPool.getPoolSize() + "队列大小：" + threadPool.getQueue().size() +
                "已经完成：" + threadPool.getCompletedTaskCount());
    }
}