package Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;

        // 此处fin被初始化为null -> 只有文件被成功打开时fin才不会为null
        FileInputStream fin = null;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found.");
        } catch (IOException exc) {
            System.out.println("An I/O Error Occurred");
        } finally {
            // Close file in all cases.
            try {
                // 只有fin不为null时才关闭
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}

/*
 * 使用finally语句关闭文件 -> 优点是如果访问文件的代码由于某种与I/O无关的异常而终止
 * finally代码块仍然会关闭文件
 * */