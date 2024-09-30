package Chapter12.TrafficLightColor_Test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;
    private boolean stop = false; // 控制线程是否停止的标志

    // 用于线程同步 -> 确保在访问共享资源时的安全
    private final Lock lock = new ReentrantLock();
    private final Condition changeCondition = lock.newCondition();

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    // 实现交通灯颜色的循环逻辑
    public void run() {
        while (!stop) {
            try {
                Thread.sleep(tlc.getDelay());
                changeColor();
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
        }
    }

    // 使用lock.lock()锁住线程 -> 确保颜色变化时没有其他线程访问tlc
    // 改变当前颜色并通知其他等待颜色变化的线程
    // finally块确保无论发生什么异常都会释放锁
    public void changeColor() {
        lock.lock();
        try {
            tlc = tlc.next();
            changeCondition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    // 线程等待交通灯颜色的变化
    public void waitForChange() {
        lock.lock();
        try {
            changeCondition.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            lock.unlock();
        }
    }

    public TrafficLightColor getColor() {
        lock.lock();
        try {
            return tlc;
        } finally {
            lock.unlock();
        }
    }

    public void cancel() {
        stop = true;
        Thread.currentThread().interrupt();
    }
}

/*
 * ReentrantLock 提供了一种灵活的锁机制
 * Condition 允许线程等待特定的条件（例如交通灯颜色的变化）
 * lock.lock() 确保只有一个线程可以修改交通灯的颜色
 * changeCondition.signalAll() 通知所有等待的线程颜色已发生变化。
 * */
