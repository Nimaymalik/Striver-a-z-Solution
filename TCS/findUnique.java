package TCS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findUnique {
    public static void unique(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 5, 2, 3, 2 };
        unique(arr);
    }

}
