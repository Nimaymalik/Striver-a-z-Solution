package Arrays;

public class ZigZag {
    public static void zigzagPrint(int[][] arr) {
        int row = arr.length;
        System.out.println("Rows=" + row);

        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");

                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        zigzagPrint(arr);

    }

}
