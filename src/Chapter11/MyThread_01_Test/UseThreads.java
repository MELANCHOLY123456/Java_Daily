package Chapter11.MyThread_01_Test;

public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread mt = new MyThread("Child #1");
        Thread newThread = new Thread(mt);
        newThread.start();

        // 主线程执行自己的任务
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                // 主线程每次暂停100毫秒
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}

/*
 * 程序启动时，主线程首先运行，输出 "Main thread starting."。
 * 随后，子线程被创建并启动，它每400毫秒输出一次计数，同时主线程每100毫秒输出一个.。
 * 两个线程并发运行，直到各自的任务完成
 * 主线程完成后输出 "Main thread ending."，子线程在完成10次计数后输出 "Child #1 terminating."。
 *
 * 通过Runnable接口和Thread类实现多线程。
 * start()方法启动线程，执行run()中的代码。
 * Thread.sleep()用于让线程暂停执行，模拟任务运行的时间。
 * */