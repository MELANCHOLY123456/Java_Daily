package Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile~");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file~");
        }

        try {
            fin.close();
        } catch (IOException exc) {
            System.out.println("Error closing file~");
        }
    }
}

// 这个程序名为 ShowFile，其作用是读取并显示指定文件的内容。为了正确运行它，用户需要
// 在命令行中提供一个文件路径作为参数，程序将打开该文件并将其内容逐字节打印到控制台。
