package Magnifest.Array;

import java.util.Scanner;

public class InsertPosition {
    public static int InsertPos(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 13, 14, 15, 50, 60 };

        System.out.println("Output is: " + InsertPos(arr, 100));

        sc.close();
    }

}
