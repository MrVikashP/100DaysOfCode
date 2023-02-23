package linked_list;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int val) {
        Node node = head;
        if (node == null){
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            if (node.next.val == val){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void showList() {
        Node temp = head;
        if (head != null){
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
