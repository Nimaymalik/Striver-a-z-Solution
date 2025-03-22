package Arrays;

public class secondLargest {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int largest = 0;
        int secondLargest = 0;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i < largest) {
                secondLargest = i;
            }

        }
        return (secondLargest == 0) ? -1 : secondLargest;

    }

    public static void main(String[] args) {

        secondLargest large = new secondLargest();
        int[] arr = { 2, 4, 6, 2, 9 }; // output= 6
        System.out.println(large.getSecondLargest(arr));

    }

}
