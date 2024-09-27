package Chapter9;

public class ExcDemo1 {
    public static void main(String[] args) {
        int[] num = new int[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        try {
            System.out.println("Before exception is generated.");
            // Generate an index out-of-bounds exception.

            for (int j : num) {
                System.out.print(j + " ");
            }
            System.out.println();
            num[7] = 10;
            System.out.println("this won't be displayed");
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}

// 要监视的代码包含在try代码块中
// 当发生异常时从try代码块抛出异常并被catch语句捕获 -> 此时控制传递给catch,try代码块被终止
// 执行catch语句后程序控制转移到catch后面的语句
// 如果try代码块没有抛出异常则不执行任何catch语句并且程序控制转移到catch语句之后