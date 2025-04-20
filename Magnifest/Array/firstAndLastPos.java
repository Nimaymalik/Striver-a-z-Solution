package Magnifest.Array;

import java.util.Arrays;

public class firstAndLastPos {
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                result = mid;
                right = mid - 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                result = mid;
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static int[] searchRange(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[] { first, last };
    }

    public static int[] searchRange2(int[] arr, int target) {
        int left = -1;
        int right = -1;
        // for left
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                left = i;
                break;
            }

        }
        // for right
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                right = i;
                break;
            }

        }

        return new int[] { left, right };

    }

    public static void main(String[] args) {
        int[] arr = { 1 };
        int target = 1;
        // System.out.println(Arrays.toString(searchRange(arr, target)));
        System.out.println(Arrays.toString(searchRange2(arr, target)));
    }

}
