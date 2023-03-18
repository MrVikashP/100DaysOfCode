package stack_queue_problems;
// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class QueueUsingStacksPushNConstant {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacksPushNConstant() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        first.push(item);
    }

    public int pop() {
        // first empty the first stack and put all items to the second
        // put back all items from the second to the first

        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peekItem = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peekItem;

    }

    public boolean empty() {
        return first.isEmpty();
    }
}
