package linked_list;

public class SinglyLinkedList {
    // In Singly LL define head, tail, size to do various operation
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        // by default each one starts with size 0
        this.size = 0;
    }

    // Q. adding node at first
    // 1. create a new node with given value
    // 2. set next node of it to head
    // 3. make it newly node as head

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if the tail is null means since it is the first element so head and tail will be pointing to the same.
        if (tail == null){
            tail = head;
        }
        // increasing the size since element is being inserted to the linked list.
        size++;
    }

    // Q. adding node at last
    // 1. create a new node with given value
    // 2. set next node of tail to it
    // 3. make it newly node as tail
    // 4. and make the next node of it null

    public void insertLast(int val) {
        // if tail is null then it is same as inserting it in first.
        if (tail == null){
            insertFirst(val);
        }
        else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
        // increasing the size since element is being inserted to the linked list.
        size++;
    }

    // Q. adding node at any index
    // 1. create a new node with given value
    // 2. check if index = 0 call insertFirst then return and if equals size - 1 call insertLast then return
    // 3. Get particular node at that index first if above condition failed. set next node of newly to particularNode.next
    // 4. then set next node of particular node to the new node.

    public void insert(int index, int val){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        // call the method to get the particular node at that index
        Node temp = getNode(index);

        if (temp.next != null) {
            node.next = temp.next;
        }
        temp.next = node;

        // increasing the size since element is being inserted to the linked list.
        size++;

    }

    private Node getNode(int index) {
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    // Q. Delete node at first
    // 1. save the value at head so can return which val was deleted
    // 2. set head to head.next
    // 3. if head == null, set tail equals null too.

    public int deleteFirst() {
        int removed = head.val;
        head = head.next;

        if (head == null){
            tail = null;
        }
        // decreasing the size since element is being deleted from the linked list.
        size--;

        return removed;
    }

    // Q. Delete node at last
    // 1. save the value at tail so can return which val was deleted
    // 2. get previous node of tail and make it as a tail.
    // 4. and make the next node of it null

    public int deleteLast() {
        if (size <= 1){
            return deleteFirst();
        }

        Node temp = getNode(size-1);
        int removed = tail.val;
        tail = temp;
        tail.next = null;

        // decreasing the size since element is being deleted from the linked list.
        size--;
        return removed;

    }

    // Q. Delete node at any index
    // 1. if size == 1 return deleteFirst, and if it equals == size-1 return deleteLast
    // 2. get the previous node to the index, get the val of index node to return
    // 3. make next of it to next.next, it will ignore the index node and can point to its next node directly

    public int delete(int index) {
        if (size <= 1){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        // get the node previous to index
        Node temp = getNode(index);
        int removed = temp.next.val;
        temp.next = temp.next.next;

        // decreasing the size since element is being deleted from the linked list.
        size--;

        return removed;

    }
    // displaying the list
    public void printList() {
        // initializing the node which in start will point to head and use it for traversal and can print the list
        Node temp = head;

        // run a loop till temp is not equal to null, print the val and move ahead
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    // defining the node and its properties
    // we do not want it to be accessed from outside this class
    // making a private class of Node and since class is a named group of properties and function
    private class Node {
        // contains own integer value
        private int val;
        // another next node whom it is going to point
        private Node next;

        // calling constructor to assign values and the next node according to the arguments.
        public Node(int val) {
            this.val = val;
        }
    }

}
