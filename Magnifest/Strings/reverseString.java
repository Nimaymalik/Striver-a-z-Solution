package Magnifest.Strings;

public class reverseString {
    public static void reverse(String s) {

        String ch = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ch += s.charAt(i);

        }
        System.out.println(ch);
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        reverse(s);
    }

}
