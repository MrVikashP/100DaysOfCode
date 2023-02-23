package string_stringBuilder;

public class IsPalindrome {
    public static void main(String[] args) {
        String name = "aba";
        boolean res = isPalin(name);
        System.out.println(res);
    }
    static boolean isPalin(String name){
        if (name == null ||name.length() == 0){
            return true;
        }
        name = name.toLowerCase();
        int start = 0;
        int last = name.length() - 1;

        while (start < last){
            if (name.charAt(start) != name.charAt(last)){
                return false;
            }
            start++;
            last--;
        }
        return true;
    }
}
