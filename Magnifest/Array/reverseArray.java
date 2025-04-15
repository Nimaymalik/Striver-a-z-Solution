package Magnifest.Array;

import java.util.Arrays;

public class reverseArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverse(int[] arr) {
        if (arr.length - 1 < 2) {
            return arr;

        }
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(reverse(arr)));

    }

}
