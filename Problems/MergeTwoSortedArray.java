package DSA.Problems;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;          // Last valid number in nums1
        int j = n - 1;          // Last number in nums2
        int k = m + n - 1;      // Last slot in nums1 (full length - 1)

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0};
        int[] nums2 = {2, 3, 5};
        merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));  // [1, 2, 2, 3, 3, 4, 5]
    }
}
