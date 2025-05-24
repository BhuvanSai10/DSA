package DSA.DsaSheet;

import java.util.Arrays;

public class MoveZerosToEnd6 {
    public static void moveZeros(int[] arr){
        int idx = 0;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]!=0){
                arr[idx] = arr[i];
                idx++;
            }
        }

        for (int i = idx ; i<arr.length ;i++){
            arr[i] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
