package DSA.Prep.Imp;

public class FindMissingNumber {

    public static int missingNumber(int arr[]) {
        long n = arr.length + 1;
        long sumN = (n * (n + 1)) / 2;
        long arrSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arrSum += arr[i];
        }
        return (int) (sumN - arrSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(missingNumber(arr)); // Output: 3

        int[] arr2 = {1, 3, 4};
        System.out.println(missingNumber(arr2)); // Output: 2
    }
}