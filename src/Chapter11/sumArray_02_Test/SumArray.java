package Chapter11.sumArray_02_Test;

public class SumArray {

    // sumArray()没有被同步
    int sumArray(int[] num) {
        int sum = 0;
        for (int j : num) {
            sum += j;
            System.out.println("Running total for " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            } catch (InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}
