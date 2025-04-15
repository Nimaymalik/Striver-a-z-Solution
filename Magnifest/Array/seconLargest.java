package Magnifest.Array;

public class seconLargest {
    public static int secondLarge(int[] arr) {
        int large = 0;
        int secondLarge = 0;

        if (arr.length - 1 < 2) {
            return -1;
        }
        for (int i : arr) {
            if (i > large) {
                secondLarge = large;
                large = i;
            } else if (i > secondLarge && i < large) {
                secondLarge = i;

            }

        }
        return (secondLarge == 0) ? -1 : secondLarge;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 7, 1, 8 };
        System.out.println(secondLarge(arr));

    }

}
