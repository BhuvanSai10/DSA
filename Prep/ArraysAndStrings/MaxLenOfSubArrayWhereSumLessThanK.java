package DSA.Prep.ArraysAndStrings;

public class MaxLenOfSubArrayWhereSumLessThanK {
    public static int maxLenSubArray(int[] arr, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;

        while (r < arr.length) {
            sum += arr[r];
            while (sum > k) {
                sum -= arr[l];
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(maxLenSubArray(new int[]{2, 5, 1, 10, 10}, 3)); //output 1
        System.out.println(maxLenSubArray(new int[]{1, 2, 3, 4, 5}, 10)); //output 3
        System.out.println(maxLenSubArray(new int[]{1, 2, 3, 4, 5}, 15)); //output 4
        System.out.println(maxLenSubArray(new int[]{1, 2, 3, 4, 5}, 16)); //output 5
    }
}