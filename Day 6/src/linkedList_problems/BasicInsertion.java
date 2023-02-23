package linkedList_problems;

public class BasicInsertion {
    // Question is to add the element at given index using recursion.
    private Node head;
    private Node tail;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if the tail is null means since it is the first element so head and tail will be pointing to the same.
        if (tail == null){
            tail = head;
        }
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
