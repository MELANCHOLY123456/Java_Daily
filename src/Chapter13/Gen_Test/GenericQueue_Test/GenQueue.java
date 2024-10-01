package Chapter13.Gen_Test.GenericQueue_Test;

import Chapter9.QueueEmptyException;

public class GenQueue<T> implements IGenQ<T> {
    private final T[] q;
    private int put_loc, get_loc;

    public GenQueue(T[] aRef) {
        q = aRef;
        put_loc = get_loc = 0;
    }

    public void put(T obj) throws QueueFullException {
        if (put_loc == q.length) {
            throw new QueueFullException(q.length);
        }
        q[put_loc++] = obj;
    }

    public T get() throws QueueEmptyException {
        if (get_loc == put_loc) {
            throw new QueueEmptyException();
        }
        return q[get_loc++];
    }
}
