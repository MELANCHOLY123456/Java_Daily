package Chapter10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        String fileName = "test_data";

        // 数据写入文件
        writeData(fileName);

        // 数据从文件中读取
        readData(fileName);
    }

    // 将数据写入文件的方法
    public static void writeData(String fileName) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName))) {
            System.out.println("Writing data to file...");

            dataOut.writeInt(i);
            System.out.println("Written int: " + i);

            dataOut.writeDouble(d);
            System.out.println("Written double: " + d);

            dataOut.writeBoolean(b);
            System.out.println("Written boolean: " + b);

            double result = 12.2 * 7.4;
            dataOut.writeDouble(result);
            System.out.println("Written calculated double: " + result);

        } catch (IOException exc) {
            System.out.println("Error writing to file: " + exc.getMessage());
        }
        System.out.println();
    }

    // 从文件读取数据的方法
    public static void readData(String fileName) {
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Reading data from file...");

            int i = dataIn.readInt();
            System.out.println("Read int: " + i);

            double d = dataIn.readDouble();
            System.out.println("Read double: " + d);

            boolean b = dataIn.readBoolean();
            System.out.println("Read boolean: " + b);

            d = dataIn.readDouble();
            System.out.println("Read calculated double: " + d);

        } catch (IOException exc) {
            System.out.println("Error reading from file: " + exc.getMessage());
        }
    }
}
