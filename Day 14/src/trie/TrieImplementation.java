package trie;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TrieImplementation {
    // defining Node
    static class Node {
        // since root can have multiple nodes so instead of defining again and again, creating array of type will be good
        Node[] children;
        boolean eow; // checking if the letter is eow or not.

        public Node() {
            // defining the size
            children = new Node[26]; // 26 because talking about string only, a - z

            // initializing the array at each, basically creating objects of type null
//            Arrays.fill(children, null);
            IntStream.range(0, children.length).forEach(i -> children[i] = null);

            // make eow of root node as false initially
            eow = false;
        }
    }
    // defining the root since it is empty in the beginning
    static Node root = new Node();

    // inserting values in the trie data structure
    public static void insert (String word) { // O(Length of word)

        Node curr = root;
        // since have to traverse each letter of word to insert
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            // if the letter is not found in the children of the root, create a new node
            if (curr.children[idx] == null) {
                // add new node
                curr.children[idx] = new Node();
            }

            // if 'i' reaches the end letter make eow to true
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }

            // make the new root - children that already exists
            curr = curr.children[idx];
        }
    }

    public static boolean search (String key) {
        Node curr = root;
        // checking for each letter
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            // if the root is not having children at that place
            if (node == null) {
                return false;
            }

            // if the traversal is done and the eow for that children at that idx is not true
            if (i == key.length() - 1 && !node.eow) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;

    }
    public static void main(String[] args) {
        String[] words = {"the", "an", "there", "their", "any"};

        for (String word : words) {
            insert(word);
        }

        // "there" "thor", "an"
        System.out.println(search("there"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
    }
}
