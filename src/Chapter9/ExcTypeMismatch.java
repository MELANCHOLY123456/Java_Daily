package Chapter9;

public class ExcTypeMismatch {
    public static void main(String[] args) {
        int[] num = new int[4];

        try {
            System.out.println("Before exception is generated.");

            // generate an index out-of-bounds exception
            num[7] = 10;
            System.out.println("this won't be displayed");
        }

        /* Can't catch an array boundary error with an
       ArithmeticException. */ catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}

// 异常的类型必须与catch语句中指定的类型相符,否则不会被捕获