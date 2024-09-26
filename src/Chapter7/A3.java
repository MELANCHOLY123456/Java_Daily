package Chapter7;

public class A3 {
    int i, j;

    A3(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B3 extends A3 {
    int k;

    B3(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); // this calls A's show()
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2, 3);

        subOb.show(); // this calls show() in B
    }
}

/* Methods with differing type signatures are
   overloaded and not overridden. */
//class A {
//    int i, j;
//
//    A(int a, int b) {
//        i = a;
//        j = b;
//    }
//
//    // display i and j
//    void show() {
//        System.out.println("i and j: " + i + " " + j);
//    }
//}
//
//// Create a subclass by extending class A.
//class B extends A {
//    int k;
//
//    B(int a, int b, int c) {
//        super(a, b);
//        k = c;
//    }
//
//    // overload show()
//    void show(String msg) {
//        System.out.println(msg + k);
//    }
//}