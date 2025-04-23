package Array;

import java.util.Arrays;

public class moveZeros {
    public static void moveZeroes(int[] nums) {
        int prev = 0;

        for (int j = 1; j < nums.length; j++) {

            while (nums[j] != 0) {
                int temp = nums[prev];
                nums[prev] = nums[j];
                nums[j] = temp;

                prev++;

            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroes(arr);

    }
}
