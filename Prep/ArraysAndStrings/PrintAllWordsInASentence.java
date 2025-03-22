package DSA.Prep.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class PrintAllWordsInASentence {
    public static void printAllWords(String sen){
        int x=0;
        int y=0;
        char[] chars = sen.toCharArray();

        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (char ch : chars){
            if (ch!=' '){
                word.append(ch);
            }
            else{
                words.add(word.toString());
                word = new StringBuilder();
            }
        }
        System.out.println(words);
    }

    public static void main(String[] args) {
        String sentence = "This is a Java Program";
        printAllWords(sentence);
    }
}
