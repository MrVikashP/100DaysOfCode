package recursion_problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    // printing permutation means without ignoring any elements and know different ways of combining them
    // String string = "abc" -> abc, acb, bac, bca, cab, cba
    public static void main(String[] args) {
        String string = "abc";
        printPermutations("", string);

        System.out.println(getPermutations("", string));

        System.out.println(permutationsCount("", string));
    }

    static void printPermutations(String ans, String string) {
        // when string gets empty, print the answer then return
        if (string.isEmpty()){
            System.out.println(ans);
            return;
        }
        // taking first character of the string
        char ch = string.charAt(0);
        int n = ans.length();

        // look at the positions where the character is going to fit in and then move ahead for the next
        // total number of positions is going to be ans.size() + 1.
        for (int i = 0; i <= n; i++) {
            // first part is before the index you are at.
            String first = ans.substring(0, i);
            // second part is after the index you are at.
            String second = ans.substring(i, n);

            printPermutations(first + ch + second, string.substring(1));
        }
    }

    static List<String> getPermutations(String ans, String string) {
        if (string.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        // taking first character of the string
        char ch = string.charAt(0);
        int n = ans.length();

        // creating a list and then will add every answer we get when function starts returning
        List<String> res = new ArrayList<>();

        // look at the positions where the character is going to fit in and then move ahead for the next
        // total number of positions is going to be ans.size() + 1.
        for (int i = 0; i <= n; i++) {
            // first part is before the index you are at.
            String first = ans.substring(0, i);
            // second part is after the index you are at.
            String second = ans.substring(i, n);

            res.addAll(getPermutations(first + ch + second, string.substring(1)));
        }

        return res;
    }

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int n = p.length();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,n);

            // get total count from the multiple recursion call for a particular recursion call.
            count = count + permutationsCount(f + ch + s, up.substring(1));

        }
        return count;
    }

}
