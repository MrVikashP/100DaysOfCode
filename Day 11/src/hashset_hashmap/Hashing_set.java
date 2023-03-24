package hashset_hashmap;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        // print
        System.out.println(set);

        // remove
        set.remove(1);

        // check whether any element is present or not
        if (set.contains(1)) {
            System.out.println("Contains the number");
        }
        else System.out.println("Do not contain"); // avoids duplicate

        System.out.println(set.size()); // print size of the set

        // traversing through the set
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
