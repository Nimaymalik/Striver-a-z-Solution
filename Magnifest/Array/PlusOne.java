package Magnifest.Array;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        for (int i = n; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 9, 9 };
        System.out.println(Arrays.toString(plusOne(arr)));

    }

}
