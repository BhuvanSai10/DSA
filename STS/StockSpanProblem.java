package DSA.STS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class StockSpanProblem {
    public static ArrayList<Integer> calculateSpan(int[] arr){
        ArrayList<Integer> span = new ArrayList<>(Collections.nCopies(arr.length,0));
        Stack<Integer> s = new Stack<>();

        for (int i = 0 ; i<arr.length ;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if (s.isEmpty()){
                span.set(i,(i+1));
            }
            else{
                span.set(i,(i-s.peek()));
            }

            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 90, 120, 80};
        ArrayList<Integer> res = calculateSpan(arr);
        System.out.println(res);
    }
}
