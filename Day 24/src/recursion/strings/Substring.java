package recursion.strings;

import java.util.ArrayList;

public class Substring {
    public static void main(String[] args) {
        String str = "abc";

        printSubstring("", str);

        System.out.println(getSubstring("", str));

        System.out.println(getSubstringAscii("", str));
    }

    static void printSubstring(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubstring(p + ch, up.substring(1) );
        printSubstring(p, up.substring(1));
    }

    static ArrayList<String> getSubstring(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = getSubstring(p + ch, up.substring(1) );
        ArrayList<String> right = getSubstring(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> getSubstringAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = getSubstringAscii(p + ch, up.substring(1) );
        ArrayList<String> right = getSubstringAscii(p, up.substring(1));
        ArrayList<String> ascii = getSubstringAscii(p + (ch + 0), up.substring(1));

        left.addAll(right);
        left.addAll(ascii);

        return left;
    }
}
