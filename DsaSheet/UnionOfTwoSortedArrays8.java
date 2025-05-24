package DSA.DsaSheet;

import java.util.Arrays;

public class UnionOfTwoSortedArrays8 {
    public static int[] union(int[] arr1,int[] arr2){
        int m = arr1.length;
        int n = arr2.length;

        int[] newArr = new int[m+n];
        int idx = 0;

        int i=0,j=0;
        while (i<m && j<n){
            if (arr1[i]<=arr2[j]){
                newArr[idx] = arr1[i];
                i++;
            }
            else{
                newArr[idx] = arr2[j];
                j++;
            }
            idx++;
        }

        while (i<m){
            newArr[idx++] = arr1[i];
            i++;
        }
        while (j<n){
            newArr[idx++] = arr1[j];
            j++;
        }

        return newArr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        System.out.println(Arrays.toString(union(arr1, arr2)));
    }
}
