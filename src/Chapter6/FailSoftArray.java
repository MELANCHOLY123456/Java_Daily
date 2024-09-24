package Chapter6;

class FailSoftArray {
    private final int[] a;
    private final int err_val;
    public int length;

    public FailSoftArray(int size, int err_v) {
        a = new int[size];
        err_val = err_v;
        length = size;
    }

    private boolean indexOK(int index) {
        return index >= 0 & index < length;
    }

    public int get(int index) {
        if (indexOK(index)) {
            return a[index];
        }
        return err_val;
    }

    public boolean put(int index, int val) {
        if (indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
}

class FailSoftArrayDemo {
    public static void main(String[] args) {
        FailSoftArray obj = new FailSoftArray(5, -1);
        int x;

        System.out.println("Fail quietly.");
        for (int i = 0; i < (obj.length * 2); i++) {
            obj.put(i, i * 10);
        }
        for (int i = 0; i < (obj.length * 2); i++) {
            x = obj.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
        System.out.print("\n");

        System.out.println("Fail with error reports.");
        for (int i = 0; i < (obj.length * 2); i++) {
            if (!obj.put(i, i * 10)) {
                System.out.println("Index " + i + " out-of-bounds");
            }
        }
    }
}
