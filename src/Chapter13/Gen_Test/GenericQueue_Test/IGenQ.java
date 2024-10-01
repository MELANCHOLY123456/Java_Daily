package Chapter13.Gen_Test.GenericQueue_Test;

import Chapter9.QueueEmptyException;
import Chapter9.QueueFullException;

public interface IGenQ<T> {
    void put(T ch) throws QueueFullException, Chapter13.Gen_Test.GenericQueue_Test.QueueFullException;

    T get() throws QueueEmptyException;
}
