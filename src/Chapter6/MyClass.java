package Chapter6;

import java.util.Scanner;

class MyClass {
    private int alpha;
    public int beta;
    int gamma;

    MyClass(int b, int g) {
        beta = b;
        gamma = g;
    }

    void setAlpha(int a) {
        alpha = a;
    }

    int getAlpha() {
        return alpha;
    }
}

class MyClassDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(88, 99);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        obj.setAlpha(num);
        System.out.println("obj.alpha is " + obj.getAlpha());
        System.out.println("obj.beta is " + obj.beta);
        System.out.println("obj gamma is " + obj.gamma);
    }
}
