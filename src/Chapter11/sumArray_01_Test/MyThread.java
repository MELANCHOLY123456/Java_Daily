package Chapter11.sumArray_01_Test;

public class MyThread implements Runnable {
    Thread thread;
    static SumArray sa = new SumArray();
    int[] a;
    int answer;

    MyThread(String name, int[] num) {
        thread = new Thread(this, name);
        a = num;
    }

    public static MyThread createAndStart(String name, int[] num) {
        MyThread myThread = new MyThread(name, num);
        myThread.thread.start();
        return myThread;
    }

    public void run() {
        int sum;
        System.out.println(thread.getName() + " starting.");
        answer = sa.sumArray(a);
        System.out.println("Sum for " + thread.getName() + " is " + answer);
        System.out.println(thread.getName() + " terminating.");
    }
}
