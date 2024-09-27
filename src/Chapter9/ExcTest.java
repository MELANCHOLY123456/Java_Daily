package Chapter9;

public class ExcTest {
    static void genException() {
        int[] num = new int[4];
        System.out.println("Before exception is generated.");

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            System.out.print(num[i] + " ");
        }
        System.out.println();

        // generate an index out-of-bounds exception
        num[7] = 10;
        System.out.println("this won't be displayed");
    }
}

class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace(); // 打印异常的堆栈跟踪信息
        }
        System.out.println("After catch statement.");
    }
}

// 从try代码块调用的方法抛出的异常可以被与try代码块匹配的catch语句捕获
// 当然这是假定方法自己没有捕获异常
