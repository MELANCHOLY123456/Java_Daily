package Chapter6;

class LocalClassDemo {
    public static void main(String[] args) {
        // 局部类嵌套在方法中
        // ShowBits类是一个不为main()以外所知的类，除了main()以外对它的任何访问都会报错
        class ShowBits {
            final int num_bits;

            ShowBits(int n) {
                num_bits = n;
            }

            void show(long val) {
                long mask = 1;
                mask <<= num_bits - 1;
                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) {
                        System.out.print(1);
                    } else {
                        System.out.print(0);
                    }
                    spacer++;
                    if ((spacer % 8) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b = 0; b < 10; b++) {
            ShowBits byte_val = new ShowBits(8);
            System.out.print(b + " in binary: ");
            byte_val.show(b);
        }
    }
}
