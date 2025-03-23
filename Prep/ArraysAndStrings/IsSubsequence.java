package DSA.Prep.ArraysAndStrings;

public class IsSubsequence {
    public static boolean checkIsSubsequence(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            if (j==s2.length()){
                break;
            }
        }
        return j == s2.length();
    }

    public static boolean checkIsSubstring(String s1, String s2) {
        if (s2.length() > s1.length()) {
            return false;
        }

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            int j;
            for (j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == s2.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "abbaaab";
        String s2 = "bbaa";
        System.out.println("Is Subsequence: " + checkIsSubsequence(s1, s2));
        System.out.println("Is Substring: " + checkIsSubstring(s1, s2));

        String s3 = "hello";
        String s4 = "ell";
        System.out.println("Is Subsequence: " + checkIsSubsequence(s3, s4));
        System.out.println("Is Substring: " + checkIsSubstring(s3, s4));

        String s5 = "abcde";
        String s6 = "ace";
        System.out.println("Is Subsequence: " + checkIsSubsequence(s5, s6));
        System.out.println("Is Substring: " + checkIsSubstring(s5, s6));

        String s7 = "abcde";
        String s8 = "aec";
        System.out.println("Is Subsequence: " + checkIsSubsequence(s7, s8));
        System.out.println("Is Substring: " + checkIsSubstring(s7, s8));
    }
}