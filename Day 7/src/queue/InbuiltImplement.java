package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InbuiltImplement {
    public static void main(String[] args) {
        // queue is an interface
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.peek()); // print top
        System.out.println(queue.poll()); // removes top
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue.size());


        // Deque is dual queue where it works like queue but operations can be done on both end.

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(50);
        deque.addLast(40);
        deque.addFirst(90);

        System.out.println(deque);
        System.out.println(deque.getFirst());

        // Many methods can be used or explored.


    }
}
