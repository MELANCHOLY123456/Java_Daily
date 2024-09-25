package Chapter6;

//class Test {
//    void noChange(int i, int j) {
//        i += j;
//        j = -j;
//    }
//}
//
//class TestDemo {
//    public static void main(String[] args) {
//        Test ob = new Test();
//        int a = 15, b = 20;
//        System.out.println("a and b before call: " +
//                a + " " + b);
//        ob.noChange(a, b);
//        System.out.println("a and b after call: " +
//                a + " " + b);
//    }
//}

class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class TestDemo {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.change(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
