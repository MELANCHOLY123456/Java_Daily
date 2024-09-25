package Chapter6;

class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    // 静态代码块在类被加载到JVM时执行，且只执行一次。
    static {
        System.out.println("Inside static block.");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }

    StaticBlock(String msg) {
        System.out.println(msg);
    }
}

class StaticBlockDemo {
    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock("Inside Constructor");

        // 直接通过类名访问静态变量，因为它们属于类而不是某个特定的对象。
        System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
        System.out.println("Square root of 3 is " + StaticBlock.rootOf3);
    }
}
