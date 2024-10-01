package Chapter13.Gen_Test.GenericQueue_Test;

public class QueueEmptyException extends Exception {
    public String toString() {
        return "\nQueue is empty.";
    }
}
