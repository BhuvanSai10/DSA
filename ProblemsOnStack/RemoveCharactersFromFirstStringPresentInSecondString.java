package DSA.ProblemsOnStack;

import java.util.Stack;

//Given two strings string1 and string2, remove those characters from the first string(string1) which are present in the second string(string2). Both strings are different and contain only lowercase characters.
//        NOTE: The size of the first string is always greater than the size of the second string( |string1| > |string2|).
//        Example:
//        Input:
//        string1 = “computer”
//        string2 = “cat”
//        Output: “ompuer”
//        Explanation: After removing characters(c, a, t)
//        from string1 we get “ompuer”.
//        Input:
//        string1 = “occurrence”
//        string2 = “car”
//        Output: “ouene”
//        Explanation: After removing characters
//        (c, a, r) from string1 we get “ouene”.
public class RemoveCharactersFromFirstStringPresentInSecondString {
    public static String removeChars(String first,String second){
        Stack<String> stack = new Stack<>();
        stack.push("");
        for (char c1:first.toCharArray()){
            boolean isPresent = false;
            for (char c2:second.toCharArray()){
                if (c1==c2){
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent){
                stack.push( stack.peek()+c1);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(removeChars("computer","cat"));
    }
}
