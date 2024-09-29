package Chapter8.Queue;

public class FixedQueue implements ICharQ {
    private final char[] q;
    private int put_loc, get_loc;

    public FixedQueue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    public void put(char ch) {
        if (put_loc == q.length) {
            System.out.println(" -- Queue is full.");
            return;
        }
        q[put_loc++] = ch;
    }

    public char get() {
        if (get_loc == put_loc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }
        return q[get_loc++];
    }
}
