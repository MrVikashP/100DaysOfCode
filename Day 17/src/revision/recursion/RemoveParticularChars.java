package revision.recursion;

public class RemoveParticularChars {
    public static void main(String[] args) {
        String given = "bsaghaaf";
        // remove all a chars from the above

        System.out.println(removeChars(given, ""));
        System.out.println(removeChars2(given));

        String given2 = "vikashpandeyji";
        System.out.println(removeStrings(given2));

    }

    static String removeChars (String given, String ans) {

        // if the given string is empty
        if (given.isEmpty()) {
            return ans;
        }

        if (given.charAt(0) != 'a') {
            ans += given.charAt(0);
        }

        return removeChars(given.substring(1), ans);
    }

    static String removeChars2 (String given) {
        if (given.isEmpty()) {
            return "";
        }

        char ch = given.charAt(0);

        if (ch == 'a') {
            return removeChars2(given.substring(1));
        }

        else {
            return ch + removeChars2(given.substring(1));
        }
    }

    static String removeStrings (String given) {
        if (given.isEmpty()) {
            return "";
        }


        if (given.startsWith("vikash")) {
            return removeStrings(given.substring(6));
        }

        else {
            return given.charAt(0) + removeStrings(given.substring(1));
        }
    }
}
