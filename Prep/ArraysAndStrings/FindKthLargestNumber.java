package DSA.Prep.ArraysAndStrings;

import java.util.PriorityQueue;

public class FindKthLargestNumber {
    public static int findKthLargestNum(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(findKthLargestNum(nums,2));
    }
}
