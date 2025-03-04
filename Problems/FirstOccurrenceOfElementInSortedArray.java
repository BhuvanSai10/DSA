package DSA.Problems;

public class FirstOccurrenceOfElementInSortedArray {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Initialize result to -1 (not found)

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; // Found a potential first occurrence
                right = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return result; // Return the index of the first occurrence, or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 8, 12, 16, 23};
        int target = 5;

        int firstOccurrenceIndex = findFirstOccurrence(arr, target);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + target + " found at index " + firstOccurrenceIndex);
        } else {
            System.out.println(target + " not found in the array.");
        }
        target = 10;
        firstOccurrenceIndex = findFirstOccurrence(arr, target);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of " + target + " found at index " + firstOccurrenceIndex);
        } else {
            System.out.println(target + " not found in the array.");

        }
    }
}
