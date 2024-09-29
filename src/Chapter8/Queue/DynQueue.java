package Chapter8.Queue;

public class DynQueue implements ICharQ {
    private char[] q;
    private int put_loc, get_loc;

    public DynQueue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    public void put(char ch) {
        if (put_loc == q.length) {
            char[] t = new char[q.length * 2];
            System.arraycopy(q, 0, t, 0, q.length);
            q = t;
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
