package Chapter13.Gen_Test.GenericMethod_Test;

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] num_01 = {1, 2, 3, 4, 5};
        Integer[] num_02 = {1, 2, 3, 4, 5};
        Integer[] num_03 = {1, 2, 7, 4, 5};
        Integer[] num_04 = {1, 2, 7, 4, 5, 6};

        if (arraysEqual(num_01, num_01)) {
            System.out.println("num_01 equals num_01");
        }

        if (arraysEqual(num_01, num_02)) {
            System.out.println("num_01 equals num_02");
        }

        if (arraysEqual(num_01, num_03)) {
            System.out.println("num_01 equals num_03");
        }

        if (arraysEqual(num_01, num_04)) {
            System.out.println("num_01 equals num_04");
        }

        Double[] d_vals = {1.1, 2.2, 3.3, 4.4, 5.5};
        /*
         * This won't compile because num_01 and d_vals are not of the same type.
         * if(arraysEqual(num_01, d_vals)){
         *     System.out.println("num_01 equals d_vals");
         * }
         * */
    }
}
