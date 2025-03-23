package DSA.Prep.ArraysAndStrings;

public class SubStringPalindrome {

    public static boolean checkPalindrome(String s ){
        int left = 0;
        int right = s.length() - 1 ;

        while(left<=right){
            if(!(s.charAt(left)==s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean checkSubStringPalindrome(String s){
        for(int i = 0 ; i<s.length() ;i++){
            for (int j = i+1 ; j<s.length() ;j++){
                if(checkPalindrome(s.substring(i,j+1))){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcabd";
        System.out.println(checkSubStringPalindrome(s));
    }
}
