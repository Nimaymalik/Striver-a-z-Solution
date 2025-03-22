package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        // int[] arr = { 13, 46, 24, 52, 20, 9 };
        int[] arr = { 5, 4, 3, 2, 1 };
        sorting(arr);
    }

}
