package Chapter7;

class X2 {
    int a;

    X2(int i) {
        a = i;
    }
}

class Y2 extends X2 {
    int b;

    Y2(int i, int j) {
        super(j);
        b = i;
    }
}

class SupSubRef {
    public static void main(String[] args) {
        X2 x = new X2(10);
        X2 x2;
        Y2 y = new Y2(5, 6);

        x2 = x; // OK, both of same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // still Ok because Y is derived from X
        System.out.println("x2.a: " + x2.a);

        // X references know only about X members
        x2.a = 19; // OK
        // x2.b = 27; // Error, X doesn't have a b member
    }
}