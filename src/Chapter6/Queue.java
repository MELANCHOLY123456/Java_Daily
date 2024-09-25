package Chapter6;

class Queue {
    private final char[] q; // 队列元素
    private int put_loc; // 表示下一个元素将被放入队列的位置
    private int get_loc; // 表示下一个元素将从队列中取出的位置

    Queue(int size) {
        q = new char[size];
        put_loc = get_loc = 0;
    }

    void put(char ch) {
        if (isFull()) {
            System.out.println("Queue is full~");
            return;
        }
        q[put_loc++] = ch;
    }

    char get() {
        if (isEmpty()) {
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

    public String printQueue() {
        StringBuilder sb = new StringBuilder();
        for (int i = get_loc; i < put_loc; i++) {
            sb.append(q[i]).append(" ");
        }
        return sb.toString();
    }
}

class Queue_Demo {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // 测试 put 操作
        System.out.println("Testing put operation.");
        queue.put('a');
        queue.put('b');
        queue.put('c');
        System.out.println("Elements in queue after puts: ");
        System.out.println(queue.printQueue());

        // 测试 get 操作
        System.out.println("\nTesting get operation.");
        System.out.println("Element removed: " + queue.get());
        System.out.println("Queue after get operation: ");
        System.out.println(queue.printQueue());

        // 再次插入元素，测试满队列
        System.out.println("\nTesting full queue condition.");
        queue.put('d');
        queue.put('e');
        queue.put('f'); // 队列应满
        System.out.println("Elements in queue: ");
        System.out.println(queue.printQueue());

        // 测试空队列获取
        System.out.println("\nRemoving all elements.");
        while (!queue.isEmpty()) {
            System.out.println("Element removed: " + queue.get());
        }
        System.out.println("Final queue state: " + queue.printQueue());
    }
}
