package hashset_hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

// Hashmap is implemented internally as array of linked list.
// each node is called buckets
// since it store the pair not in the order
// internal hash function is used to get the hash code to get the bucket index
public class Hashmap_Implementation {
    static class HashMap<K,V> { // generics
        // node having Key, Value
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no of nodes;
        private int N;
        private LinkedList<Node>[] buckets; // N = buckets.length

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[N * 2];

            // creating blank linked list
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> list : oldBuckets) {
                for (Node node : list) {
                    put(node.key, node.value);
                }
            }
        }

        private int searchInLL(int bi, K key) {
            LinkedList<Node> list = buckets[bi];

            // traverse through list, if found the key then update otherwise return -1
            for (int i = 0; i < list.size(); i++) {
                Node node = list.get(i);
                if (node.key == key) {
                    return i;
                }
            }

            return -1;
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            // this can generate any random value, but we want in the range 0 - N
            // also there must be positive integer
            return Math.abs(bi) % N;
        }

        public void put(K key, V val) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(bi, key);

            if (di == -1) { // do not exist already, create a new node
                buckets[bi].add(new Node(key,val));
                n++;
            }
            else {
                Node node = buckets[bi].get(di);
                node.value = val;
            }

            double lamda = (double) n / N;

            if (lamda > 2.0 ){
                // rehashing
                rehash();
            }

            // time complexity - O(lamda), worst case - O(n - no of nodes)
        }

        public V get(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(bi, key);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].get(di);

            return node.value;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(bi, key);

            return di != -1;
        }

        public int getSize() {
            return n;
        }

        public V remove(K key) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(bi, key);

            if (di == -1) {
                return null;
            }

            Node node = buckets[bi].remove(di); // removing that node from the linked list bucket.
            n--;
            return node.value;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keyList = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (Node node : ll) {
                    keyList.add(node.key);
                }
            }

            return keyList;

        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("Russia", 50);
        map.put("Nepal", 20);

        System.out.println(map.get("India"));
        System.out.println(map.getSize());
        System.out.println(map.remove("Nepal"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.isEmpty());

        ArrayList<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

    }

}
