package Magnifest.Array;

import java.util.Arrays;

public class ProductOfThree {
    public static int maximumProduct(int[] arr) {
        int n = arr.length - 1;
        Arrays.sort(arr);
        int max = arr[n] * arr[n - 1] * arr[n - 2];
        int max1 = arr[0] * arr[1] * arr[n];
        return Math.max(max, max1);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(maximumProduct(arr));
    }

}
