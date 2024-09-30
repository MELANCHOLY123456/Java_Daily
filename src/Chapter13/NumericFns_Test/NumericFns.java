package Chapter13.NumericFns_Test;

// 这段代码展示了Java泛型在带有边界的情况下的使用，即泛型参数T被限制为Number类的子类。
public class NumericFns<T extends Number> {
    T num;

    NumericFns(T n) {
        num = n;
    }

    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    boolean absEqual(NumericFns<?> ob) {
        return Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue());
    }

    // T 没有继承Number时下面的两个方法会报错
    /*
     * double reciprocal() {
     *     return 1 / num.doubleValue(); // Error!
     * }
     *
     * double fraction() {
     *     return num.doubleValue() - num.intValue(); // Error!
     * }
     * */
}
