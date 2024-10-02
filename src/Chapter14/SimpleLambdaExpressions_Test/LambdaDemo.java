package Chapter14.SimpleLambdaExpressions_Test;

public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal_01 = () -> 98.6;
        System.out.println("A constant value: " + myVal_01.getValue());
        MyParamValue myVal_02 = (n) -> 1.0 / n;
        System.out.println("Reciprocal of 4 is " + myVal_02.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myVal_02.getValue(8.0));

        /*
         * A lambda expression must be compatible with the method
         * defined by the functional interface. Therefore, these won't work:
         * */

        //  myVal_01 = () -> "three"; // Error! String not compatible with double!
        //  myVAl_02 = () -> Math.random(); // Error! Parameter required!
    }
}

/*
 * Lambda表达式是Java 8引入的一个特性，它允许你以简洁的方式表示实例化接口的匿名类。
 * Lambda表达式主要用于实现只有一个抽象方法的接口，这种接口称为函数式接口。
 * */
