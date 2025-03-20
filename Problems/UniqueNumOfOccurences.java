package DSA.Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumOfOccurences {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> numOccurences = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for (int num : arr) {
            numOccurences.put(num, numOccurences.getOrDefault(num, 0) + 1);
        }
        for (int count : numOccurences.values()) {
            if (!s.add(count)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,1,1,3,3}));
    }
}
