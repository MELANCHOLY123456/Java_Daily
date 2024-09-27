package Chapter9;

public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d + " is non-integer.";
    }
}

class CustomExceptDemo {
    public static void main(String[] args) {
        int[] num_er = {4, 8, 15, 32, 64, 127, 256, 512};
        int[] de_nom = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < num_er.length; i++) {
            try {
                if ((num_er[i] % 2) != 0) {
                    throw new NonIntResultException(num_er[i], de_nom[i]);
                }
                System.out.println(num_er[i] + " / " + de_nom[i] + " is " + num_er[i] / de_nom[i]);
            } catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
            } catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
            } catch (NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}