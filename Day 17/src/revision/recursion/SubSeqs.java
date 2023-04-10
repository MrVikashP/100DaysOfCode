package revision.recursion;

import java.util.ArrayList;

public class SubSeqs {
    public static void main(String[] args) {
        String given = "abc";
        printSubSeqs("", given);
        System.out.println(findSubSeqs("", given));
    }

    private static void printSubSeqs(String ans, String given) {
        if (given.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // adding char
        printSubSeqs(ans + given.charAt(0), given.substring(1));
        // ignoring char
        printSubSeqs(ans, given.substring(1));
    }

    private static ArrayList<String> findSubSeqs(String ans, String given) {
        if (given.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> first =  findSubSeqs(ans + given.charAt(0), given.substring(1));

        ArrayList<String> second =  findSubSeqs(ans, given.substring(1));

        first.addAll(second);
        return first;
    }
}
