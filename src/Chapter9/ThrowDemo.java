package Chapter9;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            throw new ArithmeticException();
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}

// 这个程序演示了 Java 中如何显式地抛出和捕获异常，尤其是使用 throw 关键字来手动抛出一个异常
