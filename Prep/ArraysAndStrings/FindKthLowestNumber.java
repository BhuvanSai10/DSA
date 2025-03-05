package DSA.Prep.ArraysAndStrings;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLowestNumber {
    public static int findKthLowestNum(int[] nums,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        System.out.println(findKthLowestNum(new int[]{1,2,3,4,5},2));
    }
}
