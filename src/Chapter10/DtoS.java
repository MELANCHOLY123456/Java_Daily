package Chapter10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {
    public static void main(String[] args) {
        String s;
        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

/*
 * 这段代码实现了一个简单的文件读取程序，名为 DtoS。它使用 BufferedReader 从
 * 名为 test.txt 的文件中逐行读取文本，并将每一行打印到控制台。
 * */