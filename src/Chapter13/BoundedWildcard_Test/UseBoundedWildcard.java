package Chapter13.BoundedWildcard_Test;

public class UseBoundedWildcard {
    // 约束通配符
    static void test(Gen<? extends A> o) {
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w1 = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        // These calls to test() are OK.
        test(w1);
        test(w2);
        test(w3);

        // Can't call test() with w4 because
        // it is not an object of a class that
        // inherits A.
        // test(w4); // Error!
    }
}
