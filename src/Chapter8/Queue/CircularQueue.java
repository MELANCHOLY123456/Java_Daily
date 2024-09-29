package Chapter8.Queue;

public class CircularQueue implements ICharQ {
    private final char[] q;
    private int put_loc, get_loc;

    public CircularQueue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    public void put(char ch) {
        if (put_loc + 1 == get_loc | ((put_loc == q.length - 1) & (get_loc == 0))) {
            System.out.println(" -- Queue is full.");
            return;
        }
        q[put_loc++] = ch;
        if (put_loc == q.length) {
            put_loc = 0;
        }
    }

    public char get() {
        if (get_loc == put_loc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }
        char ch = q[get_loc++];
        if (get_loc == q.length) {
            get_loc = 0;
        }
        return ch;
    }
}
