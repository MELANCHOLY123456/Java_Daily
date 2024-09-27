package Chapter9;

public class NestTry {
    public static void main(String[] args) {
        int[] num_er = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] de_nom = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < num_er.length; i++) {
                try {
                    System.out.println(num_er[i] + " / " + de_nom[i] + " is " + num_er[i] / de_nom[i]);
                } catch (ArithmeticException exc) {
                    // catch the exception
                    System.out.println("Can't divide by Zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("No matching element found.");
            System.out.println("Fatal error -- program terminated.");
        }
    }
}
