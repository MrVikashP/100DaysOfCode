package queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue customQueue = new CustomQueue();

        customQueue.add(10);
        customQueue.add(20);
        customQueue.add(30);

        System.out.println(customQueue.remove());
        customQueue.display();

        System.out.println(customQueue.front());

        CircularQueue circularQueue = new CircularQueue();

        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);

        circularQueue.display();

        System.out.println(circularQueue.remove());

        circularQueue.display();

        System.out.println(circularQueue.front());

        circularQueue.insert(50);

        circularQueue.display();


    }
}
