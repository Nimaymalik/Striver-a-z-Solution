package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map1=new HashMap<>();
        Map<Character,Character> map2=new HashMap<>();

         if (s.length() != t.length()) {
            return false;
        }
        for(int i=0;i<s.length();i++){
            char char1=s.charAt(i);
            char char2=t.charAt(i);
        
        

        if(map1.containsKey(char1) && map1.get(char1)!=char2){
            return false;
        }
        if(map2.containsKey(char2) && map2.get(char2)!=char1){
            return false;
        }
        map1.put(char1,char2);
        map2.put(char2,char1);
        
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "add";
        String second = "egg";

        IsomorphicString str = new IsomorphicString();
        System.out.println(str.isIsomorphic(second, first));

    }

}
