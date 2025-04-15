package Arrays;

public class MissingNumber {
    // sorted array
    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int actualsum = 0;

        for (int i : arr) {
            actualsum += i;

        }
        return sum - actualsum;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };
        System.out.println(findMissing(arr));

    }

}
