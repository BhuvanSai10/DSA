package DSA.DsaSheet;

import java.util.Arrays;

public class LeftRotateArrayKTimes5 {
    public static void reverse(int[] arr,int l,int r){
        while(l<=r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    public static void rotateLeftK(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateLeftK(arr,2);
        System.out.println(Arrays.toString(arr));
    }
}
