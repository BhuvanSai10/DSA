package ProblemsOnStack;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] findNextSmallerElement(int[] arr){
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0;i<arr.length ; i++){
            while (!stack.isEmpty() && stack.peek()>arr[i]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,2,5};
        System.out.println(Arrays.toString(findNextSmallerElement(arr)));
    }
}
