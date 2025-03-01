package DSA.Problems;

import java.util.Arrays;
import java.util.Stack;

public class ReverseAnArray {
    public static void reverse(int[] arr,int from,int to){
        Stack<Integer> stack = new Stack<>();
        for(int i = from ; i<to ; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()){
            arr[from++] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        reverse(nums,0, 2);
        System.out.println(Arrays.toString(nums));
    }

}
