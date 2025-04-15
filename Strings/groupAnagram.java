package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // to store the string of same pairs
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());

    }

    public static void main(String[] args) {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(arr));

    }

}
