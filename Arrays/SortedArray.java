package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SortedArray {
    public int singleNonDuplicate(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
            }

        }
        return ans;
    }

    public int singleNon(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            while ((i + 1) < nums.length - 1) {

                if (nums[i] == nums[i + 1]) {
                    i += 2;
                } else {
                    ans = nums[i];
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        SortedArray print = new SortedArray();
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        System.out.println(print.singleNon(arr));
        // System.out.println(print.singleNonDuplicate(arr));

    }

}
