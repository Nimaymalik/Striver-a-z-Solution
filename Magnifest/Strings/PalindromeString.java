package Magnifest.Strings;

public class PalindromeString {
    public static boolean reverse(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "nimay";
        System.out.println(reverse(s));

    }

}
