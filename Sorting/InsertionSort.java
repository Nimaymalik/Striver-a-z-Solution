package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int select = i;

            while (select > 0 && arr[select] < arr[select - 1]) {
                int temp = arr[select];
                arr[select] = arr[select - 1];
                arr[select - 1] = temp;
                select--;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        Sorting(arr);

    }

}
