package Chapter12.AutoBox_Test;

public class AutoBox_03 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;
        iOb = 99;
        System.out.println("Original value of iOb: " + iOb);

        /*
         * 首先会将 iOb 的值从 Integer 对象拆箱为 int 类型，进行自增操作（++）
         * 然后再将结果重新装箱为 Integer 对象并赋值给 iOb。
         * */
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        /*
         * 首先，iOb 会被自动拆箱为 int 类型，值为 100，然后与 10 相加
         * 结果 110 再次被装箱为 Integer 对象，赋值给 iOb。
         * */
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
    }
}
