package Chapter6;

class Outer {
    int[] num;

    Outer(int[] n) {
        num = n;
    }

    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    class Inner {
        int min() {
            int m = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] < m) {
                    m = num[i];
                }
            }
            return m;
        }

        int max() {
            int m = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] > m) {
                    m = num[i];
                }
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int j : num) {
                a += j;
            }
            return a / num.length;
        }
    }
}

class OuterDemo {
    public static void main(String[] args) {
        int[] x = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer obj = new Outer(x);
        obj.analyze();
    }
}
