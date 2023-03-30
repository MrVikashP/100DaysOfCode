package trie;

public class WordBreak {

    public static boolean isFound(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String first = key.substring(0,i);
            String second = key.substring(i);

            if (TrieImplementation.search(first) && isFound(second)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile"};

        for (String word : words) {
            TrieImplementation.insert(word);
        }

        String key = "ilikesamsung";

        System.out.println(isFound(key));
    }
}
