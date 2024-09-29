package Chapter11.TickTock_Test;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread mt_01 = MyThread.createAndStart("Tick", tt);
        MyThread mt_02 = MyThread.createAndStart("Tock", tt);

        try {
            mt_01.thread.join();
            mt_02.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
