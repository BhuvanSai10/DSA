package DSA.Problems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInAString {
    public static char findFirstNonRepeatingCharInAString(String s){
        Map<Character,Integer> mp = new HashMap<>();

        for (char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        for (char ch : s.toCharArray()) {
            if (mp.get(ch) == 1) {
                return ch;
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatingCharInAString("abbaccdc"));
    }
}
