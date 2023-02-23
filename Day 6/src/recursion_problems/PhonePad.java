package recursion_problems;
import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");

        System.out.println(letterCombinations("","12"));
    }

    static void pad(String p, String up) {
        // when un processed string is empty, print the processed one then return
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        // get the starting digit of the string
        int digit = up.charAt(0) - '0'; // this convert '1' to 1.

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // take the char value for every pass
            char ch = (char) ('a' + i);

            pad(p + ch, up.substring(1));
        }
    }

    static List<String> letterCombinations(String p, String up) {
        // when un processed string is empty, print the processed one then return
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // get the starting digit of the string
        int digit = up.charAt(0) - '0'; // this convert '1' to 1.
        List<String> result = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // take the char value for every pass
            char ch = (char) ('a' + i);

            result.addAll(letterCombinations(p + ch, up.substring(1)));
        }
        return result;
    }
}
