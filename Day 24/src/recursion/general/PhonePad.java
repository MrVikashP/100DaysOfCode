package recursion.general;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        phonePad("", "12");
        System.out.println(phonePad2("", "112"));
    }

    static void phonePad(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            phonePad(p + ch, up.substring(1));

        }
    }

    static List<String> phonePad2(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            list.addAll(phonePad2(p + ch, up.substring(1)));

        }

        return list;

    }
}
