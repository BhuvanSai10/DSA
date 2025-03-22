package DSA.Prep.ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateWordsInASentence {
    public static void removeDuplicates(String sen){

        String[] words = sen.split(" ");
        List<String> list = new ArrayList<>();

        for (String word : words){
            if (!list.contains(word)){
                list.add(word);
            }
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        String sentence = "This is is a dup dup a";

        removeDuplicates(sentence);
    }
}
