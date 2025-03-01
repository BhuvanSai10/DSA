package DSA.Problems;

import java.util.Arrays;
import java.util.Stack;

public class RotateArrayRightByK {
    public static void rotate(int[] nums , int k){
        reverse(nums,0,nums.length);
        reverse(nums,0,k% nums.length);
        reverse(nums,k% nums.length,nums.length);
    }
    public static void reverse(int[] arr,int from,int to){
        Stack<Integer> stack = new Stack<>();
        for(int i = from ; i<to ; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            arr[from++] = stack.pop();
        }
    }
//    private void reverse(int[] nums, int left, int right) {
//        while (left < right) {
//            int temp = nums[left];
//            nums[left] = nums[right];
//            nums[right] = temp;
//            left++;
//            right--;
//        }
//    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
