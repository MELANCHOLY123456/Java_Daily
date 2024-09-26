package Chapter7;

public class A4 {
    final void meth() {
        System.out.println("This is a final method.");
    }
}

class B4 extends A4 {
    // ERROR! Can't override.
    // void meth
    // {
    //     System.out.println("Illegal!");
    // }
}