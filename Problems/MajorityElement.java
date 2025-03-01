package DSA.Problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
            if(freqMap.get(nums[i])>len/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
