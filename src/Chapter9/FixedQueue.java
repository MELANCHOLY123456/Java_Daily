package Chapter9;

public class FixedQueue implements ICharQ {
    private char[] q;
    private int put_loc, get_loc;

    public FixedQueue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (put_loc == q.length) {
            throw new QueueFullException(q.length);
        }
        q[put_loc++] = ch;
    }


    public char get() throws QueueEmptyException {
        if (get_loc == put_loc) {
            throw new QueueEmptyException();
        }
        return q[get_loc++];
    }
}
