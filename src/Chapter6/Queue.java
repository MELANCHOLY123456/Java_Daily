package Chapter6;

class Queue {
    private final char[] q;
    private int put_loc; // 表示下一个元素将被放入队列的位置
    private int get_loc; // 表示下一个元素将从队列中取出的位置

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

    int size() {
        return put_loc - get_loc;
    }

    boolean isEmpty() {
        return get_loc == put_loc;
    }

    boolean isFull() {
        return put_loc == q.length;
    }
}

class Queue_Demo {
//    public static String printQueue(Queue queue) {
//        StringBuilder sb = new StringBuilder();
//
//    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Testing put operation.");
        queue.put('a');
        queue.put('b');
        queue.put('c');
        System.out.println("Elements in queue after puts: ");
    }
}
