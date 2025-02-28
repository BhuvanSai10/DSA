package DSA.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromSortedArray2 {
    public static int removeDuplicates(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;

        for (int i = 0 ; i<nums.length ; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           if(map.get(nums[i])<3){
                nums[index++] = nums[i];
           }
        }

        return index;
    }
//    public int removeDuplicates(int[] nums) {
//        int k = 2;
//
//        for (int i = 2; i < nums.length; i++) {
//            if (nums[i] != nums[k - 2]) {
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//
//        return k;
//    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
