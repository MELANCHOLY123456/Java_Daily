package Chapter6;

class Factorial {
    int factR(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = factR(n - 1) * n;
        return result;
    }

    int factI(int n) {
        int result = 1;
        for (int t = 1; t <= n; t++) {
            result *= t;
        }
        return result;
    }
}

class FactorialDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Factorials using recursive method.");
        System.out.println("Factorial of 3 is " + f.factR(3));
        System.out.println("Factorial of 4 is " + f.factR(4));
        System.out.println("Factorial of 5 is " + f.factR(5));
        System.out.println();

        System.out.println("Factorials using iterative method.");
        System.out.println("Factorial of 3 is " + f.factI(3));
        System.out.println("Factorial of 4 is " + f.factI(4));
        System.out.println("Factorial of 5 is " + f.factI(5));
    }
}

// recursive 递归的
// iterative 迭代的