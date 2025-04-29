package DSA.STS;

import java.util.ArrayList;

public class MaxSumOfSubArrayOfLenK {
    public static ArrayList<Integer> maxSumOfSubArrOfLenK(int[] arr,int k){
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0 ; i<=arr.length-k ; i++){
            int max = arr[i];
            for (int j = 1 ; j<k ; j++){
                if (arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            res.add(max);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        System.out.println(maxSumOfSubArrOfLenK(arr,3));
    }
}
