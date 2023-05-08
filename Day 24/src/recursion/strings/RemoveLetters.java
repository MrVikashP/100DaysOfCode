package recursion.strings;

public class RemoveLetters {
    public static void main(String[] args) {
        String str = "abacdeaf";
        char target = 'a';
        removeTarget("", str,target);
        System.out.println(remove(str, target));

        String s = "appletgame";
        System.out.println(skipString(s));
    }

    static void removeTarget(String p, String up, char target) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == target) {
            removeTarget(p, up.substring(1),target);
        }
        else removeTarget(p + ch , up.substring(1), target);
    }

    static String remove(String str, char target){
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == target) {
            return remove(str.substring(1), target);
        }
        else return ch + remove(str.substring(1), target);
    }

    static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if (str.startsWith("apple")){
            return skipString(str.substring(5));
        }
        else return ch + skipString(str.substring(1));

    }
}
