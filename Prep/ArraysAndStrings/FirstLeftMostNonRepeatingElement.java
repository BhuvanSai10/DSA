package DSA.Prep.ArraysAndStrings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstLeftMostNonRepeatingElement {
    public static int firstNonRepeating(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n)
                return arr[i];
        }
        return -1;
    }

    public static int firstNonRepeatingAnotherApproach(int arr[], int n) {
        // Use LinkedHashMap to preserve insertion order
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating element
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {

        int arr[] = { 9, 4, 9, 6, 7, 4 };
        int n = arr.length;

        System.out.print(firstNonRepeating(arr, n));
    }
}
