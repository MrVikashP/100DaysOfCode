package revision.recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String string = "abc";
        printPermutation("", string);

        System.out.println(getPermutation("", string));

        System.out.println(countPermutation("", string));
    }

    static void printPermutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            printPermutation(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> getPermutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(getPermutation(f + ch + s, up.substring(1)));
        }

        return ans;
    }

    static int countPermutation(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            count += countPermutation(f + ch + s, up.substring(1));
        }

        return count;
    }
}
