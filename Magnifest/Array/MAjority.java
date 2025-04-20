package Magnifest.Array;

import java.util.Arrays;

public class MAjority {
    public static int majorityElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];

    }
    public static void main(String[] args) {
        int[] arr={6,6,6,7,7};
        System.out.println(majorityElement(arr));
       
    }
    
}
