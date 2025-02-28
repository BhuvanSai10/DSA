package DSA.Problems;
public class SumOfDigitsOfStringAfterConvert{
    public static int getLucky(String s, int k) {
        String digits = "";
        for(int  i = 0 ; i<s.length(); i++){
            digits = digits + (s.charAt(i)-96);
        }
        for (int i = 0 ; i<k ; i++){
            digits = findSum(digits);
        }
        return Integer.parseInt(digits);
    }
    public static String findSum(String digits){
        int sum = 0;
        for (int i = 0 ; i<digits.length() ; i++){
            sum = sum + (digits.charAt(i) - '0');
        }
        return String.valueOf(sum);
    }
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
}
