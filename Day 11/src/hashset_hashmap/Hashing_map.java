package hashset_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing_map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // insert
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 40);

        // print
        System.out.println(map);

        // updating values for the exiting keys
        map.put("India", 180);
        System.out.println(map); // when key already present then updates the value otherwise create a new section in map.

        // contains or not
        if (map.containsKey("India")) {
            System.out.println("key is present in the map");
        } else System.out.println("not present");

        // traversing through each set pair
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // traversing through each key value
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        // remove
        map.remove("China");
        System.out.println(map);
    }
}
