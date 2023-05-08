package recursion.strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abc";

        printPermutations("", str);

        System.out.println(printPermutations2("", str));
    }

    static void printPermutations(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        for (int i = 0; i < p.length() + 1; i++) {

            char ch = up.charAt(0);
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            printPermutations(f + ch + s, up.substring(1));
        }
    }

    static ArrayList<String> printPermutations2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < p.length() + 1; i++) {

            char ch = up.charAt(0);
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            ans.addAll(printPermutations2(f + ch + s, up.substring(1)));
        }

        return ans;
    }

}
