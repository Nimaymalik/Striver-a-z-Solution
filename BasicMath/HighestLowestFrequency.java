package BasicMath;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    public static void checkHighLowFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }

        int minValue = Collections.min(map.values());
        int maxValue = Collections.max(map.values());

        System.out.println(maxValue + " " + minValue);

    }

    public static void main(String[] args) {

        int[] arr = { 10, 15, 10, 5, 10, 5 };

        checkHighLowFreq(arr);
    }

}
