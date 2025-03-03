package DSA.Problems;

import java.util.Arrays;

public class MaxNumOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        int operationCount = 0;
        int left=0;
        int right = nums.length- 1;
        Arrays.sort(nums);

        while(left<right){
            if(nums[left]+nums[right] == k){
                operationCount++;
                left++;
                right--;
            } else if ((nums[left]+nums[right])<k) {
                left++;
            }
            else{
                right--;
            }

        }
        return operationCount;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4,5},5));
    }

}
