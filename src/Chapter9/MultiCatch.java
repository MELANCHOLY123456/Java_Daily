package Chapter9;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 88;
        int b = 0;
        int result;
        char[] chr = {'A', 'B', 'C'};

        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    result = a / b; // generate an ArithmeticException
                } else {
                    chr[5] = 'X'; // generate an ArrayIndexOutOfBoundsException
                }
                // This catch clause catches both exceptions.
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e);
            }
        }
        System.out.println("After multi-catch.");
    }
}
