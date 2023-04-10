package revision.linked_list;

public class Main {
    public static void main(String[] args) {
        SLL_Implementation sll = new SLL_Implementation();

        // adding elements
        sll.insertFirst(10);
        sll.insertFirst(20);
        sll.insertFirst(30);
        sll.insertLast(50);
        sll.insert(99,1);

        sll.display();
        System.out.println();

        // deleting elements
        System.out.println(sll.deleteFirst());
        sll.display();
        System.out.println();

        System.out.println(sll.deleteLast());
        sll.display();
        System.out.println();

        System.out.println(sll.delete(2));
        sll.display();
        System.out.println();

        DLL_Implementation dll = new DLL_Implementation();
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.insertFirst(40);
        dll.insertFirst(50);
        dll.insertLast(99);

        dll.insertAfter(121,30);

        dll.display();

        CLL_Implementation cll = new CLL_Implementation();

        cll.insert(20);
        cll.insert(40);
        cll.insert(50);
        cll.insert(99);

        cll.display();
        System.out.println();

        cll.delete(99);
        cll.display();




    }

}
