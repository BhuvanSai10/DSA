package DSA.Problems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i]>nums[index]){
                nums[++index] = nums[i];
            }
        }
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
