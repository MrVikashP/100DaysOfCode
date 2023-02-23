package string_stringBuilder;

public class StringBuilderIntro {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.print(builder);
        System.out.println();
        System.out.print(builder.reverse());
        System.out.println();
        System.out.println(builder.deleteCharAt(0));

        // can explore different methods of StringBuilder
    }
}
