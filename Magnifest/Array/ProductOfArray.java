package Magnifest.Array;

import java.util.Arrays;

public class ProductOfArray {
    public static int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        // compute left part
        int curr = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] *= curr;
            curr *= nums[i];
        }

        // compoute right part
        // arr[1,1,2,6]
        curr = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= curr;// 6
            curr *= nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(productExceptSelf(arr)));

    }

}
