package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = (start + end) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] <= end) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;

            }
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }

        }
        quicksort(arr, low, end);
        quicksort(arr, start, high);

    }

    public static void main(String[] args) {
        int[] arr = { 4, 1, 7, 9, 3 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
