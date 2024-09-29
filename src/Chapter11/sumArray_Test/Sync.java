package Chapter11.sumArray_Test;

public class Sync {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        MyThread mt1 = MyThread.createAndStart("Child #1", a);
        MyThread mt2 = MyThread.createAndStart("Child #2", a);

        try {
            mt1.thread.join();
            mt2.thread.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
