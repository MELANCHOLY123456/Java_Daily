package Chapter4;

class MyClass {
    int x;

    MyClass() {
        x = 10;
    }

    MyClass(int i) {
        x = i;
    }
}

class MyClass_Demo {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(15);
        System.out.println(obj1.x + " " + obj2.x);
    }
}
