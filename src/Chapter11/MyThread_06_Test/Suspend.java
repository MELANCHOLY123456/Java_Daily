package Chapter11.MyThread_06_Test;

public class Suspend {
    public static void main(String[] args) {
        MyThread mt1 = MyThread.createAndStart("My Thread");

        try {
            Thread.sleep(1000); // let ob1 thread start executing

            mt1.my_suspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.my_resume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.my_suspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.my_resume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.my_suspend();
            System.out.println("Stopping thread.");
            mt1.my_stop();

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        // wait for thread to finish
        try {
            mt1.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}
