package Strings;

public class LargestOddSubstring {
    public String largestOddNumber(String num) {
        // checking from last digit if even then continue and if odd than its the
        // largest substring
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";

    }

    public static void main(String[] args) {
        String s = "52";
        LargestOddSubstring str = new LargestOddSubstring();
        System.out.println(str.largestOddNumber(s));

    }

}
