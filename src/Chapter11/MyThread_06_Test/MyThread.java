package Chapter11.MyThread_06_Test;

public class MyThread implements Runnable {
    Thread thread;
    boolean suspended; // 为true时挂起线程
    boolean stopped; // 为true时终止线程

    MyThread(String name) {
        thread = new Thread(this, name);
        suspended = false;
        stopped = false;
    }

    public static MyThread createAndStart(String name) {
        MyThread mythread = new MyThread(name);
        mythread.thread.start();
        return mythread;
    }

    public void run() {
        System.out.println(thread.getName() + " starting.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }

                // Use synchronized block to check suspended and stopped.
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " exiting.");
    }

    synchronized void my_stop() {
        stopped = true;

        // The following ensures that a suspended thread can be stopped.
        suspended = false;
        notify();
    }

    // Suspend the thread.
    synchronized void my_suspend() {
        suspended = true;
    }

    // Resume the thread.
    synchronized void my_resume() {
        suspended = false;
        notify();
    }
}
