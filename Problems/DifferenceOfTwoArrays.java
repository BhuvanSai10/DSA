package DSA.Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        for(int val : s1){
            if(!s2.contains(val)){
                answer.get(0).add(val);
            }
        }
        for(int val : s2){
            if(!s1.contains(val)){
                answer.get(1).add(val);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));
    }
}
