package Chapter11.MyThread_05_Test;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");

        try {
            mt1.thread.join();
            System.out.println("Child #1 joined.");
            mt2.thread.join();
            System.out.println("Child #2 joined.");
            mt3.thread.join();
            System.out.println("Child #3 joined.");
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
