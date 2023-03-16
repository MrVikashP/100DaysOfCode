package queue;

public class CustomQueue {
    // internally it is an array
    public int[] data;

    // set the default size as some values
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void add (int item) {
        if (isFull()) {
            System.out.println("Queue is Full, Can't add new item");
        }

        data[end] = item;
        end++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
        }
        int removed = data[0];

        // shifting the items

        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Nothing to show since stack is empty");
        }

        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    public boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }
}
