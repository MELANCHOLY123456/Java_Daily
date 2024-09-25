package Chapter6;

class my_class {
    int x;

    my_class() {
        System.out.println("Inside my_class().");
        x = 0;
    }

    my_class(int i) {
        System.out.println("Inside my_class(int).");
        x = i;
    }

    my_class(double d) {
        System.out.println("Inside my_class(double).");
        x = (int) d;
    }

    my_class(int i, int j) {
        System.out.println("Inside my_class(int, int).");
        x = i * j;
    }
}

class my_classDemo {
    public static void main(String[] args) {
        my_class t1 = new my_class();
        my_class t2 = new my_class(88);
        my_class t3 = new my_class(17.23);
        my_class t4 = new my_class(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
