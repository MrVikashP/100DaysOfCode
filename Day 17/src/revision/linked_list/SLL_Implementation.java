package revision.linked_list;

public class SLL_Implementation {
    private Node head;
    private Node tail;

    private int size;

    public SLL_Implementation() {
        this.size = 0;
    }

    // inserting first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = getNode(index - 1);
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst () {
        int removed = head.val;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return removed;
    }

    public int deleteLast () {
        if (size <= 1){
            return deleteFirst();
        }
        Node temp = getNode(size - 2);
        int removed = tail.val;

        tail = temp;
        tail.next = null;

        size--;
        return removed;
    }

    public int delete (int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node node = getNode(index);

        int removed = node.val;

        Node prev = getNode(index - 1);
        prev.next = node.next;

        size--;
        return removed;
    }

    public Node getNode(int index) {
        Node temp = head;

        for (int i = 0;temp.next != null && i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.print("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
