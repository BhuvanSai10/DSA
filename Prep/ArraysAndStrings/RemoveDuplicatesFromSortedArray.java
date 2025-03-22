package DSA.Prep.ArraysAndStrings;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void removeDuplicates(int[] arr){
        int j=0;
        for (int i = 1 ; i<arr.length ; i++){
            if(!(arr[j] == arr[i])){
                arr[++j] = arr[i];
            }
        }
        Arrays.fill(arr,++j,arr.length,0);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3,4,4,4,5,6,6};

        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
