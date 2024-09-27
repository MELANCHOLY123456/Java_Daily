package Chapter9;

public class ExcDemo3 {
    public static void main(String[] args) {
        int[] num_er = {4, 8, 16, 32, 64, 128};
        int[] de_nom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num_er.length; i++) {
            try {
                System.out.println(num_er[i] + " / " + de_nom[i] + " is " + num_er[i] / de_nom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            }
        }
    }
}
