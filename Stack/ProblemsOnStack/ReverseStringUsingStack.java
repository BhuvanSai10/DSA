package DSA.Stack.ProblemsOnStack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed= new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
    public static String reverseWordsInSentence(String sentence){
        char[] chars = sentence.toCharArray();
        StringBuilder reversedWords = new StringBuilder();
        int startIndex= 0;
        int endIndex;
        for (int i = 0; i<chars.length ; i++){
            if (chars[i]==' '){
                endIndex = i;
                String word = sentence.substring(startIndex,endIndex);
                reversedWords.append(reverse(word));
                reversedWords.append(" ");
                startIndex = i+1;
            }
        }
        reversedWords.append((reverse(sentence.substring(startIndex))));
        return reversedWords.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseWordsInSentence("Bhuvan sai chowdary"));
    }
}
