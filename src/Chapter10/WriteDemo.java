package Chapter10;

public class WriteDemo {
    public static void main(String[] args) {
        int b = 'X';
        System.out.write(b);
        System.out.write('\n');
    }
}

// System.out.write() 方法需要一个整数作为参数，它会将该整数解释为一个字节值并输出对应的字符
// System.out.println() 可以更简便地输出带换行的字符串
