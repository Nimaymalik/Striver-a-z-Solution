package Arrays;

import java.util.Arrays;

public class MoveZeroAtLast {
    public static int[] movezeros(int[] arr) {
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                first++;
            }

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0 };

        System.out.println(Arrays.toString(movezeros(arr)));

    }

}
