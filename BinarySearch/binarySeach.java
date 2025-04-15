package BinarySearch;

public class binarySeach {
    public static int find(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int target = 7;
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(find(arr, target));
    }

}
