package Chapter11.MyThread_04_Test;

public class MoreThreads_02 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.thread.isAlive() ||
                mt2.thread.isAlive() ||
                mt3.thread.isAlive());

        System.out.println("Main thread ending.");
    }
}
