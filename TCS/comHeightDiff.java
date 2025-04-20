package TCS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class comHeightDiff {
    public static void checkDiff(int[] arr) {

        // check for negative number
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                System.out.println("Not valid");
                return;
            }
            i++;

        }
        // pushing the diff into new arr
        int size = arr.length - 1;

        int[] newarr = new int[size];

        int j = 0;
        while (j < arr.length && j + 1 < arr.length) {
            newarr[j] = arr[j + 1] - arr[j];
            j++;
        }
        System.out.println(Arrays.toString(newarr));

        Map<Integer, Integer> map = new HashMap<>();
        // int diff = 0;
        for (int k : newarr) {
            if (map.containsKey(k)) {
                map.put(k, map.get(k) + 1);

            } else {
                map.put(k, 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                System.out.println(entry.getKey());
                return;

            }

        }
        System.out.println("None");

    }

    public static void main(String[] args) {
        int[] arr = { 150, 155, 158 };
        checkDiff(arr);
    }
}