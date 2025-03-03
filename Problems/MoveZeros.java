package DSA.Problems;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=0){
                nums[index++] = nums[i];
            }
            i++;
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
