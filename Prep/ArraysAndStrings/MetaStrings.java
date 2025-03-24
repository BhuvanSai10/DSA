package DSA.Prep.ArraysAndStrings;

public class MetaStrings {

    public static boolean checkMetaStrings(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int first = -1,second = -1,count = 0;
        for(int i = 0 ; i<s1.length() ;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count == 1){
                    first = i;
                }else if(count==2){
                    second = i;
                }else {
                    return false;
                }
            }

        }

        return count==2 &&
                s1.charAt(first)==s2.charAt(second)
                && s1.charAt(second) == s2.charAt(first);
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "keegs";

        System.out.println( checkMetaStrings(s1,s2));
    }
}
