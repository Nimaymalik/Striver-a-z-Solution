package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;

            }
        }
        // checking the right half again
        while (left <= mid) {
            list.add(arr[left]);
            left++;

        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);

        }

    }

    public static int[] mergeSort(int[] arr, int low, int high) {

        if (low >= high) {
            return arr;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid); // first half
        mergeSort(arr, mid + 1, high); // secondhalf
        merge(arr, low, mid, high);

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 6, 7 };
        int low = 0;
        int high = arr.length - 1;
        System.out.println(Arrays.toString(mergeSort(arr, low, high)));
    }
}