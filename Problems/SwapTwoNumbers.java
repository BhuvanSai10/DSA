package DSA.Problems;

import java.util.Arrays;

public class SwapTwoNumbers {
    public static void swap(int[] arr){
        arr[0] = arr[0]^arr[1];
        arr[1] = arr[0]^arr[1];
        arr[0] = arr[0]^arr[1];

//        arr[0] = arr[0]+arr[1];
//        arr[1] = arr[0]-arr[1];
//        arr[0] = arr[0]-arr[1];
    }
    public static void main(String[] args) {
        int[] arr = {1,2};
        swap(arr);

        System.out.println(Arrays.toString(arr));
    }
}
