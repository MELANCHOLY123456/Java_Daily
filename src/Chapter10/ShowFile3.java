package Chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile3 {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

/*
 * 该程序使用了 Java 的 try-with-resources 语法，确保文件输入流在使用完毕后自动关闭。
 * 这种结构确保了即使在读取文件时发生异常，文件输入流也能被正确关闭，避免资源泄漏。
 * */
