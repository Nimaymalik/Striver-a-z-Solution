package Magnifest.Array;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroesToLast(int[] arr) {
        int prev = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {
                int temp = arr[prev];
                arr[prev] = arr[j];
                arr[j] = temp;
                prev++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToStart(int[] arr) {
        int prev = 0;
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == 0) {
                int temp = arr[prev];
                arr[prev] = arr[j];
                arr[j] = temp;
                prev++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 2, 12 };
        moveZeroesToLast(nums);
        moveZeroesToStart(nums);
    }

}
