package Chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream f_in = null;
        FileOutputStream f_out = null;

        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try {
            f_in = new FileInputStream(args[0]);
            f_out = new FileOutputStream(args[1]);

            do {
                i = f_in.read();
                if (i != -1) {
                    f_out.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (f_in != null) {
                    f_in.close();
                }
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (f_out!=null){
                    f_out.close();
                }
            }catch (IOException exc){
                System.out.println("Error Closing Output File");
            }
        }
    }
}
