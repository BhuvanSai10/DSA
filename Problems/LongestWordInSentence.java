package DSA.Problems;

public class LongestWordInSentence {
    public static int findLongestWordLen(String sen){
        String[] words = sen.split(" ");
        int maxLen = -1;
        for (String word:words){
            if (word.length()>maxLen) {
                maxLen = word.length();
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(findLongestWordLen("My name is Bhuvan sai"));
    }
}
