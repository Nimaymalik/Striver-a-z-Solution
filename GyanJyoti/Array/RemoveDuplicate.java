package Array;

public class RemoveDuplicate {
    public  static int removeDuplicates(int[] nums) {
        int j=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
            
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(removeDuplicates(arr));

    }
    
}
