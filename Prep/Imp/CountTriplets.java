package DSA.Prep.Imp;

import java.util.Arrays;

public class CountTriplets {

    public static int countTriplets(int[] nums){
        int count = 0;
        Arrays.sort(nums);
        int left =0,right =0;

        for (int i = 2 ; i<nums.length ; i++){
            left = 0;
            right = i-1;
            while (left<right){
                int sum = nums[left]+nums[right];

                if( sum > nums[i]){
                    right--;
                }
                else if(sum < nums[i]){
                    left++;
                }
                else{
                    count++;
                    left++;
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,3,2};
        System.out.println(countTriplets(nums));
    }
}
