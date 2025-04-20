package Magnifest.Array;

import java.util.Arrays;

public class anagramCheck {
    static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()) return false;

        a=a.toLowerCase();
        b=b.toLowerCase();

        char[] char1=a.toCharArray();
        char[] char2=b.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        for (int i = 0; i < char2.length; i++) {
           if(char1[i] !=char2[i]) return false;
        }
        return true;



    }
    public static void main(String[] args) {
        String a="cata";
        String b="tacb";

        System.out.println(isAnagram(a, b));
        
    }
    
}
