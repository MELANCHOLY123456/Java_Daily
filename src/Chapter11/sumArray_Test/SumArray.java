package Chapter11.sumArray_Test;

public class SumArray {

    synchronized int sumArray(int[] num) {
        int sum = 0;
        for (int j : num) {
            sum += j;
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}
