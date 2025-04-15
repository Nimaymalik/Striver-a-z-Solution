package Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean check(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int i = 0;
        int j = 0;
        while (i < first.length && j < second.length) {
            if (first[i] != second[j]) {
                return false;
            }
            i++;
            j++;

        }

        return true;

    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(check(s, t));
    }
}