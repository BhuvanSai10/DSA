package DSA.Problems;

public class BinarySearch {
    public static int search(int[] arr,int val){
        int l = 0;
        int r = arr.length;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == val){
                return mid;
            }
            if(val < arr[mid]){
                r = mid-1;
            }else {
                l = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3,4,5,6,7,8},6));
    }
}
