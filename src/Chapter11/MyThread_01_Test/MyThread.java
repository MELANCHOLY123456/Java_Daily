package Chapter11.MyThread_01_Test;

public class MyThread implements Runnable {
    String threadName;

    MyThread(String name) {
        threadName = name;
    }

    public void run() {
        System.out.println(threadName + " starting.");
        try {
            for (int count = 0; count < 10; count++) {
                // 使用Thread.sleep(400)，让线程每次暂停400毫秒，模拟工作负载。
                Thread.sleep(400);
                System.out.println("In " + threadName + ", count is " + count);
            }
        } catch (InterruptedException exc) {
            // 如果在睡眠期间线程被中断（抛出InterruptedException），则捕获异常并打印中断信息。
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " terminating.");
    }
}

/*
 * MyThread对象可以运行于自己的线程中，因为MyThread类实现了Runnable接口
 * */