package Magnifest.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] Directremove(int[] arr) {
        // direct Approach
        return Arrays.stream(arr).distinct().toArray();
    }

    public static int[] remove(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);

        }

        return set.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4 };
        // System.out.println(Arrays.toString(Directremove(arr)));
        System.out.println(Arrays.toString(remove(arr)));
    }

}
