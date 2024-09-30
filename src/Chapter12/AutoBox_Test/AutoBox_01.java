package Chapter12.AutoBox_Test;

public class AutoBox_01 {
    public static void main(String[] args) {
        Integer iOb = 100;  // 自动将 int 100 转换为 Integer 对象
        int i = iOb;  // 自动将 Integer 对象转换为 int
        System.out.println(i + " " + iOb);
    }
}
