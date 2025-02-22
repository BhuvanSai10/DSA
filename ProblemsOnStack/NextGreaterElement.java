package DSA.ProblemsOnStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    static ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        // Initialize res with -1 for all elements
        for (int i = 0; i < n; i++) {
            res.add(-1);
        }

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Pop elements from the stack that are less
            // than or equal to the current element
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }

            // If the stack is not empty, the top element
            // is the next greater element
            if (!stk.isEmpty()) {
                res.set(i, stk.peek());
            }

            // Push the current element onto the stack
            stk.push(arr[i]);
        }

        return res;
    }
    public static int[] findNextGreaterElements(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 0 ; i<arr.length ; i++){
            int j = i+1;
            stack.push(arr[i]);
            while (j<arr.length){
                if (arr[j]>stack.peek()){
                    stack.pop();
                    stack.push(arr[j]);
                    break;
                }
                j++;
            }
            if (stack.peek()==arr[i]){
                result[i] = -1;
                stack.pop();
            }
            if (!stack.isEmpty()){
                result[i] = stack.pop();
            }
        }
        result[arr.length-1] = -1;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {50,40,30,10};
        System.out.println(Arrays.toString(findNextGreaterElements(arr)));
    }
}
