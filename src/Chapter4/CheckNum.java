package Chapter4;

import java.util.Scanner;

class CheckNum {
    boolean isEven(int x) {
        return (x % 2) == 0;
    }

    boolean isFactor(int a, int b) {
        return (b % a) == 0;
    }
}

class CheckNumDemo {
    public static void main(String[] args) {
        CheckNum obj = new CheckNum();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (obj.isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is not even.");
        }
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        if (obj.isFactor(num1, num2)) {
//            System.out.println(num1 + " is factor.");
//        } else {
//            System.out.println(num1 + " is not factor.");
//        }
    }
}
