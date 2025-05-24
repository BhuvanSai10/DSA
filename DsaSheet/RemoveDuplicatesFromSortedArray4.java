package DSA.DsaSheet;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray4 {
    public static void removeDuplicates(int[] arr){
        int idx = 0;
        for (int i = 1 ; i<arr.length ; i++){
            if (arr[idx]!=arr[i]) {
                idx++;
                arr[idx] = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,2,3,4,5,5,7};
        removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));
    }
}
