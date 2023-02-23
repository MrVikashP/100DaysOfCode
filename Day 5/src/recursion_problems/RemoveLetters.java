package recursion_problems;

public class RemoveLetters {
    // Q. There is given string and a target letter and task is to remove all target letter from the given string if present.
    public static void main(String[] args) {
        String string = "bccadaaea";
        String ans = skipAll(string, 'a');
        System.out.println(ans); // bccde.

        skipsAll("", string, 'c'); // badaaea;

        String s = "bcapplevp";
        System.out.println(skipWord(s, "apple"));
    }

    static String skipAll(String string, char target) {
        // base condition
        // when it becomes empty just return empty string.
        if (string.isEmpty()){
            return "";
        }
        // find char at index 0 of string
        // compare it with target
        // if same then skip that char and move ahead with the next call
        // if not same then store it and then add to returned value when function starts returning.

        char ch = string.charAt(0);
        if (ch == target) {
            // pass the string whose index starts with 1 of the previous ones existing, and it repeats for every call
            return skipAll(string.substring(1), target);
        }
        else {
            // when not equal to target add it to function call so when function starts returning, it will add the char too.
            return ch + skipAll(string.substring(1), target);
        }

    }

    static void skipsAll(String ans, String string, char target) {
        // base condition
        // when string is empty, then print the ans
        // because when string becomes empty nothing to compare and ans is ready to print
        if (string.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // find char at index 0 of string
        // compare it with target
        // if same then leave the ans as it is and move ahead with the next call
        // if not same then add it to the ans that will be returned when function starts returning.

        char ch = string.charAt(0);

        if (ch == target){
            // leave the ans as it is, pass the string whose index starts with 1 of the previous ones existing,
            // and it repeats for every call
            skipsAll(ans, string.substring(1), target);
        }
        else {
            // add the char to the ans  pass the string whose index starts with 1 of the previous ones existing,
            // and it repeats for every call
            skipsAll(ans + ch, string.substring(1), target);
        }
    }

    static String skipWord(String string, String target) {
        if (string.isEmpty()) {
            return "";
        }
        // if string starts with the target then skip all those chars of the target and pass the string after that

        if (string.startsWith(target)){
            return skipWord(string.substring(target.length()), target);
        }
        else {
            // if not same add the char to the function returning and pass the string starts with index 1 of the original.
            return string.charAt(0) + skipWord(string.substring(1), target);
        }
    }

}
