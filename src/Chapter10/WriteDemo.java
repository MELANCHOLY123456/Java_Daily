package Chapter10;

public class WriteDemo {
    public static void main(String[] args) {
        int b = 'X';
        System.out.println(b);
        System.out.write(88);
        System.out.flush(); // 刷新输出流 -> 确保输出立即显示
    }
}

/*
 * System.out.write()方法需要一个整数作为参数，它会将该整数解释为一个字节值并输出对应的字符
 * System.out.println()可以更简便地输出带换行的字符串
 * 不会经常用write()来执行控制台输出(尽管在某些情况下很有用) -> 因为println()更简单
 * */
