package DSA.Prep.ArraysAndStrings;
import java.util.ArrayList;
import java.util.List;

//finds the 4 valid arrays: [1, 2, 4, 8], [1, 2, 4, 9], [1, 2, 4, 10], and [1, 2, 5, 10] for n = 4 and k = 10
public class ValidArraysAMDCodingRoundQues {
    public static int countValidArrays(int n, int k) {
        List<Integer> currentArray = new ArrayList<>();
        int[] count = {0}; // Use an array to simulate pass by reference

        for (int startVal = 1; startVal <= k / (int) Math.pow(2, n - 1); startVal++) {
            currentArray.add(startVal);
            backtrack(currentArray, n, k, count);
            currentArray.remove(currentArray.size() - 1); // Backtrack
        }

        return count[0];
    }

    private static void backtrack(List<Integer> currentArray, int n, int k, int[] count) {
        if (currentArray.size() == n) {
            count[0]++;
            return;
        }

        int lastVal = currentArray.get(currentArray.size() - 1);
        for (int nextVal = 2 * lastVal; nextVal <= k; nextVal++) {
            currentArray.add(nextVal);
            backtrack(currentArray, n, k, count);
            currentArray.remove(currentArray.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 10;
        int result = countValidArrays(n, k);
        System.out.println(result); // Output: 4
    }
}
