package Arrays;

import java.util.Arrays;

public class MoveZeroAtFirst {
    public static int[] move(int[] arr) {
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[first];
                arr[first] = temp;
                first++;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1 };
        System.out.println(Arrays.toString(move(arr)));

    }

}
