package Chapter6;

class Queue02 {
    private final char[] q; // this array holds the queue
    private int put_loc;
    private int get_loc;

    Queue02(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    Queue02(Queue02 obj) {
        put_loc = obj.put_loc;
        get_loc = obj.get_loc;
        q = new char[obj.q.length];

        if (put_loc - get_loc >= 0) {
            System.arraycopy(obj.q, get_loc, q, get_loc, put_loc - get_loc);
        }
    }

    Queue02(char[] a) {
        put_loc = 0;
        get_loc = 0;
        q = new char[a.length];

        for (char c : a) {
            put(c);
        }
    }

    void put(char ch) {
        if (put_loc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        q[put_loc++] = ch;
    }

    char get() {
        if (get_loc == put_loc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        return q[get_loc++];
    }
}

class Queue02Demo {
    public static void main(String[] args) {
        Queue02 q1 = new Queue02(10);

        char[] name = {'T', 'o', 'm'};
        Queue02 q2 = new Queue02(name);

        char ch;
        int i;

        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }

        Queue02 q3 = new Queue02(q1);

        System.out.print("Contents of q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Contents of q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
    }
}
