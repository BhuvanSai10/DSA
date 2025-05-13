package DSA.Ultimate;

import java.util.Arrays;

public class BinarySearch6 {
    public static int binarySearch(int[] arr,int key){
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;

        while(left<=right){
            int mid = left + (right - left) / 2;
            if (arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,0,3,5,9,12},5));
    }
}
