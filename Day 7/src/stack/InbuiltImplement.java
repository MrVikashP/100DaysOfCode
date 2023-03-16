package stack;

import java.util.Stack;

public class InbuiltImplement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.pop();

        // top item
        System.out.println(stack.peek());

        System.out.println(stack);


    }
}