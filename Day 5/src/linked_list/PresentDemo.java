package linked_list;

public class PresentDemo {
    public static void main(String[] args) {
        // Singly Linked List
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insertFirst(20);
//        list.insertFirst(27);
//        list.insertFirst(46);
//
//        list.insertLast(11);
//
//        list.insert(4,99);
//
//        list.printList();
//
//        System.out.println(list.deleteFirst());
//        list.printList();
//
//        System.out.println(list.deleteLast());
//        list.printList();
//
//        System.out.println(list.delete(3));
//        list.printList();

        // Doubly Linked List
//        DoublyLinkedList list1 = new DoublyLinkedList();
//        list1.insertFirst(10);
//        list1.insertFirst(30);
//        list1.insertFirst(50);
//
//        list1.insertLast(40);
//
//        list1.insert(30, 99);
//
//        list1.displayList();

        // Circular Linked List
        CircularLinkedList list2 = new CircularLinkedList();
        list2.insert(50);
        list2.insert(40);
        list2.insert(11);

        list2.delete(11);

        list2.showList();




    }
}
