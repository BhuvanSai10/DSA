package DSA.Prep.ArraysAndStrings;
import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String s1,String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);
    }

    public static void main(String[] args) {
        String s1 = "baab";
        String s2 = "abba";

        System.out.println(checkAnagram(s1,s2));
    }
}
