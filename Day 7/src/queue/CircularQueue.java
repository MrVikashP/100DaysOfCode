package queue;

public class CircularQueue {
    // internally it is an array
    public int[] data;

    // set the default size as some values
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;

    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int val) {
        if (isFull()) {
            System.out.println("No more insertion allowed");
        }
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("No front present");
        }

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        int i = front;

        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        }while ( i != end);

        System.out.println("END");
    }

    public boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }


}
