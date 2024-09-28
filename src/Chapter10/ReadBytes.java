package Chapter10;

import java.io.IOException;

/*
 * 可能发生的任何I/O异常都被抛出到main()以外 -> 这种方法在从控制台读取数据时
 * 十分常见，但是如果愿意也可以自己处理这些类型的错误
 * */

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Enter some characters (up to 10):");
        // 该方法会一直读取直到遇到换行符或者达到数组的大小限制
        int bytesRead = System.in.read(data); // 读取数据到数组中
        System.out.println(bytesRead);
        if (bytesRead == -1) {
            System.out.println("No data was entered.");
        } else {
            System.out.print("You entered: ");
            for (int i = 0; i < bytesRead; i++) { // 只遍历实际读取的字节
                System.out.print((char) data[i]);
            }
        }
    }
}

/*
 * 在Java中，System.in.read(byte[] b) 方法从标准输入流中
 * 读取一些字节数并将它们存储在数组 b 中。它返回实际读取的字节数。
 *  */