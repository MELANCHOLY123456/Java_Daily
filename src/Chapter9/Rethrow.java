package Chapter9;

public class Rethrow {
    public static void genException() {
        int[] num_er = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] de_nom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num_er.length; i++) {
            try {
                System.out.println(num_er[i] + " / " + de_nom[i] + " is " + num_er[i] / de_nom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
                throw exc; // rethrow the exception
            }
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // re_catch exception
            System.out.println("Fatal error -- " +
                    "program terminated.");
        }
    }
}

/* 该程序展示了如何在捕获异常后，选择重新抛出异常并让调用方处理。
 * ArithmeticException 被捕获和处理，而 ArrayIndexOutOfBoundsException 被捕
 * 获后重新抛出，由上层处理。*/
