package Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) {
        int i;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]); FileOutputStream f_out = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if (i != -1) f_out.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
