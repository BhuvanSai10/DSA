package DSA.Ultimate;

public class ValidPalindrome {
    public static boolean validPalindrome(String s){
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0 , j = cleaned.length()-1;
        while(i<j){
            if (cleaned.charAt(i)!=cleaned.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(validPalindrome("A man, a plan, a canal: Panama"));
    }
}
