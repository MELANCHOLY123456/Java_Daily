package Chapter6;

class Queue {
    private char[] q;
    private int put_loc, get_loc;

    Queue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    void put(char ch) {
        if (put_loc == q.length) {
            System.out.println("Queue is full~");
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
