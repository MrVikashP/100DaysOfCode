package linked_list;

public class DoublyLinkedList {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        if (head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }
    public void insert(int after, int val){
        Node node = getNode(after);
        if (node == null){
            return;
        }
        Node toInsert = new Node(val);
        toInsert.next = node.next;
        if (node.next != null){
            node.next.prev = toInsert;
        }
        node.next = toInsert;
        toInsert.prev = node;

    }

    private Node getNode(int after) {
        Node temp = head;
        while (temp != null){
            if (temp.val == after){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }


    public void displayList(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        // printing in reverse
        while (last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

    }
}
