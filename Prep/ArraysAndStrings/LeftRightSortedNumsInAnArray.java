package DSA.Prep.ArraysAndStrings;

import java.util.Arrays;

public class LeftRightSortedNumsInAnArray {

    public static void printLeftRightSortedInArray(int[] arr){

        int[] newArr = new int[arr.length];
        for (int i = 1 ; i<arr.length-1 ; i++){
            if (!(arr[i]>arr[i-1] && arr[i]<arr[i+1])){
                newArr[i] = -1;
            }
            else {
                newArr[i] = arr[i];
            }
        }
        newArr[0] = -1;
        newArr[arr.length-1] = -1;
        System.out.println(Arrays.toString(newArr));

    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,2,4,5,6,7};
        printLeftRightSortedInArray(arr);
    }
}
