package DSA.Prep.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        int len = nums.length;
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > len / 2) {
                return num;
            }
        }
        return -1;
    }
}
