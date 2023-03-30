package trie;

public class LongestWord {
    static String ans = "";

    static void getLongestWord(TrieImplementation.Node node, StringBuilder builder) {
        if (node == null) {
            return;
        }

        for (int i = 0; i < 26 ; i++) {
            if (node.children[i] != null && node.children[i].eow) {
                builder.append((char) (i + 'a'));

                if (builder.length() > ans.length()) {
                    ans = builder.toString();
                }
                getLongestWord(node.children[i], builder);

                builder.deleteCharAt(builder.length() - 1);
            }

        }
    }
    // LongestWord with all prefixes
    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "apple", "appl", "ap", "man"};
//        String[] words = {"ab", "abc", "abd"};
        for (String word : words) {
            TrieImplementation.insert(word);
        }

        getLongestWord(TrieImplementation.root, new StringBuilder());
        System.out.println(ans);

        String ans2 = getLongestWord2(words);
        System.out.println(ans2);
    }

    static String getLongestWord2(String[] words) {
        String ans = "";
        // traverse each word of the words
        for (String word : words) {
            boolean isCompare = true;
            for (int i = 1; i <= word.length(); i++) {
                if (!TrieImplementation.search(word.substring(0,i))) {
                    isCompare = false;
                    break;
                }
            }

            if (isCompare) {
                if (ans.length() < word.length()) {
                    ans = word;
                }
            }

        }

        return ans;
    }


}
