package DSA.Problems;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
        int j = 0;
        boolean found;
        for(int i = 0 ; i<s.length() ;i++){
            found = false;
            while(j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if(j==t.length() && !found){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","aecfb"));
    }
}
