package trie;

import static trie.TrieImplementation.root;

public class StartsWith {

    public static boolean isStartsWith(String prefix) {
        TrieImplementation.Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "man", "school", "hum", "app", "women"};

        for (String word : words) {
            TrieImplementation.insert(word);
        }

        String prefix = "hume";

        System.out.println(isStartsWith(prefix));
    }
}
