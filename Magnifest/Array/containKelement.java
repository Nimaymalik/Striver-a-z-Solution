package Magnifest.Array;

import java.util.HashMap;
import java.util.Map;

public class containKelement {
    public static int check(int[] arr, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        // storing all the lement s of array in hashMap
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);

            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

        }

        for (int i : arr) {
            // int abs = Math.abs(i - k);
            if (map.containsKey(i - k)) {
                count += map.get(i - k);
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        int k = 2;
        System.out.println(check(arr, k));

    }
}