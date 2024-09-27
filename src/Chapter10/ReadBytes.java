package Chapter10;

import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Enter some characters (up to 10):");
        int bytesRead = System.in.read(data); // 读取数据到数组中
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