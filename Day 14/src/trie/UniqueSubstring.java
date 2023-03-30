package trie;

public class UniqueSubstring {

    public static int findTotalNodes(TrieImplementation.Node curr) {
        if (curr == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            if (curr.children[i] != null) {
                count += findTotalNodes(curr.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "ababa";
        // unique substring - a, ab, aba, abab, ababa,b, ba, bab, baba, ""
        // all unique prefix of all suffix will be the answer for total unique substring or
        // vice versa (overwrite suffix with prefix) will give the same answer
        // since we know that prefix are not repeated in the trie
        // so first find all the suffix and then make a trie with the help of these
        // and if we observe carefully then will see that total number of nodes are the answer for the total substring

        // find all suffix and make a trie data structure with these values
        for (int i = 0; i < str.length(); i++) {
            TrieImplementation.insert(str.substring(i));
        }

        // find the total count of the Nodes
        int ans = findTotalNodes(TrieImplementation.root);

        System.out.println(ans);
    }
}
