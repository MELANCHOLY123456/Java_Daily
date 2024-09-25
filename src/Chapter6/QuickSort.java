package Chapter6;

class QuickSort {
    static void quick_sort(char[] items) {
        qs(items, 0, items.length - 1);
    }

    private static void qs(char[] items, int left, int right) {
        int i = left;
        int j = right;
        char x = items[(left + right) / 2];

        do {
            while ((items[i] < x) && (i < right)) {
                i++;
            }
            while ((x < items[j]) && (j > left)) {
                j--;
            }
            if (i <= j) {
                char y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) {
            qs(items, left, j);
        }
        if (i > right) {
            qs(items, i, right);
        }
    }
}

class QSDemo {
    public static void main(String[] args) {
        char[] a = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        System.out.print("Original array: ");
        for (char c : a) {
            System.out.print(c);
        }
        System.out.println();
        QuickSort.quick_sort(a);
        System.out.print("Sorted array: ");
        for (char c : a) {
            System.out.print(c);
        }
    }
}