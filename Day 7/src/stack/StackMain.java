package stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new CustomStack();
        CustomStack customStack1 = new DynamicStack();

        customStack.push(10);
        customStack.push(20);
        customStack.push(30);

        System.out.println(customStack.pop());
        System.out.println(customStack.peek());

        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);
        customStack1.push(10);

        // now we can push as many items since there is no any restriction to it.
    }
}
