package Chapter12.AutoBox_Test;

public class AutoBox_02 {
    // This method has an Integer parameter.
    static void m(Integer v) {
        System.out.println("m() received " + v);
    }

    // This method returns an int.
    static int m2() {
        return 10;
    }

    // This method returns an Integer.
    static Integer m3() {
        return 99; // autoboxing 99 into an Integer.
    }

    public static void main(String[] args) {
        // Pass an int to m().  Because m() has an Integer
        // parameter, the int value passed is automatically boxed.
        m(199);

        // Here, iOb receives the int value returned by m2().
        // This value is automatically boxed so that it can be
        // assigned to iOb.
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        // Next, m3() is called. It returns an Integer value
        // which is auto-unboxed into an int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Next, Math.sqrt() is called with iOb as an argument.
        // In this case, iOb is auto-unboxed and its value promoted to
        // double, which is the type needed by sqrt().
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}

/*
 * 1) -> 自动装箱（Autoboxing）：Java会在需要对象类型时，自动将基本数据类型转换为对应的封装类。例如：
 *           m(199); 中，199 被自动装箱为 Integer 对象。
 *           Integer iOb = m2(); 中，int 值 10 被自动装箱为 Integer。
 * 2) -> 自动拆箱（Unboxing）：Java会在需要基本类型时，自动将封装类对象转换为对应的基本数据类型。例如：
 *           int i = m3(); 中，Integer 对象被自动拆箱为 int。
 *           Math.sqrt(iOb) 中，iOb 自动拆箱为 int，然后再提升为 double。
 * 这段代码展示了Java如何通过自动装箱和拆箱简化了原始类型和对象类型之间的转换，从而使代码更加简洁和易于维护。
 * */
