package stack_queue_problems;
// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class QueueUsingStacksPopNConstant {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacksPopNConstant() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        while (!first.empty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.empty()) {
            first.push(second.pop());
        }

    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();

    }

    public boolean empty() {
        return first.isEmpty();
    }
}
