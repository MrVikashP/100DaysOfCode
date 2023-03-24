package stack_queue_problems;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' ) {
                stack.push(ch);
            }

            if (ch == ')') {
                if ( stack.isEmpty() || stack.pop()!= '(' ) {
                    return false;
                }
            }

            if (ch == '}') {
                if (stack.isEmpty() || stack.pop()!= '{' ) {
                    return false;
                }

            }

            if (ch == ']') {
                if (stack.isEmpty() || stack.pop()!= '[' ) {
                    return false;
                }

            }
        }

        return stack.isEmpty();

    }
}