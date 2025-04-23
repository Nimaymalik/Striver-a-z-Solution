package Array;

import java.util.*;

public class DifferenceOFTwo {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);

        }
        for (int num : nums2) {

            set2.add(num);
        }

        Set<Integer> ori1 = new HashSet<>(set1);
        Set<Integer> ori2 = new HashSet<>(set2);
        

        ori1.removeAll(set2);
        ori2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(ori1));
        result.add(new ArrayList<>(ori2));

        return result;

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 2, 4, 6 };
        System.out.println(findDifference(arr1, arr2));
    }

}
