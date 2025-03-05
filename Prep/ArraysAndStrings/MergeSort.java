package DSA.Prep.ArraysAndStrings;

public class MergeSort {
    public static void mergeSortArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int leftSize = mid - l + 1;
        int rightSize = r - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[l + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = l;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[mergedIndex++] = leftArr[leftIndex++];
            } else {
                arr[mergedIndex++] = rightArr[rightIndex++];
            }
        }

        while (leftIndex < leftSize) {
            arr[mergedIndex++] = leftArr[leftIndex++];
        }

        while (rightIndex < rightSize) {
            arr[mergedIndex++] = rightArr[rightIndex++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSortArray(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}