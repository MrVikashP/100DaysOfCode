package revision.linked_list;

public class CLL_Implementation {
    Node head;
    Node tail;

    public CLL_Implementation() {
        head = null;
        tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete (int val) {
        Node node = head;
        if (node != null) {
            if (node.val == val) {
                head = head.next;
                tail.next = head;
                return;
            }

            do {
                if (node.next.val == val) {
                    node.next = node.next.next;
                    break;
                }

                node = node.next;
            }while (node != head);
        }
    }

    public void display() {
        Node node = head;

        if (node != null) {
            do {
                System.out.print(node.val + " -> ");
                node = node.next;
            }while (node != head);
        }

        System.out.print("Head");
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
