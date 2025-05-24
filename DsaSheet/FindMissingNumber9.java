package DSA.DsaSheet;

public class FindMissingNumber9 {
    public static int findMissingNumber(int[] arr,int n){
        int sumN = (n * (n + 1))/2;
        int sum = 0;
        for (int i = 0  ; i<arr.length ; i++){
            sum+=arr[i];
        }

        return sumN - sum;
    }
    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1,2,4,5},5));
    }
}
