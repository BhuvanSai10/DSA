package DSA.Prep.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllWordsInASentence {
    public static void printAllWords(String sen){
        String[] words = sen.split(" ");
        for(String word : words){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String sentence = "This is a Java Program";
        printAllWords(sentence);
    }
}
