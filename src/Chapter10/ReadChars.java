package Chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, period to quit.");

        // read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}

/*
 * 这段代码实现了一个简单的字符输入读取程序，名为 ReadChars。它使用 BufferedReader 类
 * 从标准输入（通常是键盘）读取字符，直到用户输入一个句点（.）为止。
 * */