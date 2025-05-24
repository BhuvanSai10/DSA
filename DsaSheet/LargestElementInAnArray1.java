package DSA.DsaSheet;

public class LargestElementInAnArray1 {
    public static int findLargestNum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (num>max){
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(findLargestNum(new int[]{1,5,7,2,4}));
    }
}
