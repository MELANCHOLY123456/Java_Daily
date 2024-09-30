package Chapter12.AutoBox_Test;

public class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100); //手动装箱，将 int 100 转换为 Integer 对象
        int i = iOb.intValue(); // 手动拆箱，将 Integer 对象转换为 int
    }
}
