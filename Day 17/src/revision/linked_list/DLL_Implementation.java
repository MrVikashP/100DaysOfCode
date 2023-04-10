package revision.linked_list;

public class DLL_Implementation {
    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;

        if (head != null){
            head.prev = node;
        }

        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insertAfter(int val, int after) {
        Node p = getNode(after);

        Node node = new Node(val);

        node.next = p.next;
        p.next = node;
        node.prev = p;

        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node getNode (int val) {
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }

            node = node.next;
        }

        return null;
    }

    public void display () {
        Node temp = head;
        Node temp2 = null;

        while (temp != null) {
            System.out.print(temp.val + " - > ");
            temp2 = temp;
            temp = temp.next;
        }
        System.out.print("END");

        System.out.println();

        while (temp2 != null){
            System.out.print(temp2.val + " - > ");
            temp2 = temp2.prev;
        }

        System.out.print("START");

    }
    private class Node {
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
