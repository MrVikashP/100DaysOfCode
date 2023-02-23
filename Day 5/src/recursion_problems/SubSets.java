package recursion_problems;

import java.util.ArrayList;

public class SubSets {
    // Adding or removing some elements from the array or string is called the subset pattern
    // for example "abc" -> a, b, c, ab, ac, bc, abc
    // above we can see that some elements are ignored or some are taken so making the subsets of the string abc there
    // we can do it both in recursion and iteration to get those subsets
    // In recursion, take the string answer which starts with empty and start taking and ignoring the elements respectively
    // when the string becomes empty means nothing to check and compare then return the answer.

    public static void main(String[] args) {
        String original = "abc";
        findSubSets("", original);

        System.out.println(getSubSets("", original));

        System.out.println(getAsciiSubSets("", original));
    }

    // no retuning, print the subsets one after another.
    static void findSubSets(String ans, String original) {
        if (original.isEmpty()){
            // when original string is empty just print the ans
            System.out.print(ans + " ");
            return;
        }
        // store the char of an original string
        char ch = original.charAt(0);

        // case 1 - add it to the ans
        findSubSets(ans + ch, original.substring(1));

        // case 2 - ignore and move ahead
        findSubSets(ans, original.substring(1));

    }

    // returning the subsets
    static ArrayList<String> getSubSets(String ans, String original) {
        // when original is empty create a new array list, add the ans, return the array list.
        if (original.isEmpty()){
            ArrayList<String> res = new ArrayList<>();
            res.add(ans);
            return res;
        }

        // take the char at index 0
        char ch = original.charAt(0);

        // case 1
        // take the char and move ahead with the new string starts from index 1, store it in an array list when value returned
        ArrayList<String> first = getSubSets(ans + ch, original.substring(1));

        // case 2
        // Ignore the char and move ahead with the new string starts from index 1, store it in an array list when value returned
        ArrayList<String> second = getSubSets(ans, original.substring(1));

        // since above returned value are stored locally so when function starts returning, will take the local answer with them
        first.addAll(second);
        return first;

    }

    // returning the sub sets with ascii values
    static ArrayList<String> getAsciiSubSets(String ans, String original) {
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = original.charAt(0);

        ArrayList<String> list1 = getAsciiSubSets(ans + ch, original.substring(1));
        ArrayList<String> list2 = getAsciiSubSets(ans, original.substring(1));
        ArrayList<String> list3 = getAsciiSubSets(ans + (ch + 0), original.substring(1));

        list1.addAll(list2);
        list1.addAll(list3);
        return list1;
    }

}
