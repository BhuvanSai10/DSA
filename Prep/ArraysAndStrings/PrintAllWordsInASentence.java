package DSA.Prep.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllWordsInASentence {
    public static void printAllWords(String sen){
        int x=0;
        int y=0;
        char[] chars = sen.toCharArray();
        List<List<String>> words = new ArrayList<>();
        List<String> word = new ArrayList<>();
        for (char ch : chars){
            if (ch!=' '){
                word.add(ch);
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "This is a Java Program";
        printAllWords(sentence);
    }
}
