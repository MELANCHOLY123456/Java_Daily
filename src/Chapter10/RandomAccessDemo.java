package Chapter10;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double[] data = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            // Write values to the file.
            for (double datum : data) {
                raf.writeDouble(datum);
            }

            // Now, read back specific values
            raf.seek(0); // seek to first double
            d = raf.readDouble();
            System.out.println("First value is " + d);

            raf.seek(8); // seek to second double
            d = raf.readDouble();
            System.out.println("Second value is " + d);

            raf.seek(8 * 3); // seek to fourth double
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);

            System.out.println();

            // Now, read every other value.
            System.out.println("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2) {
                raf.seek(8L * i); // seek to ith double
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

/*
 * 这段代码实现了一个简单的随机访问文件操作示例，名为RandomAccessDemo。它使用RandomAccessFile
 * 类来写入和读取 double 类型的数据，展示了如何在文件中随机访问特定位置的数据。
 * */