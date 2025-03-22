package Strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s");
        StringBuilder build = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            build.append(str[i]);
            if (i > 0) {
                build.append(" ");
            }

        }
        return build.toString();

    }

    public static void main(String[] args) {
        String s = "my name is nimay";
        ReverseWords words = new ReverseWords();
        System.out.println(words.reverseWords(s));

    }

}
