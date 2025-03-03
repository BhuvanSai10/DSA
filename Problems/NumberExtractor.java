package DSA.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NumberExtractor {

    // Method to extract numbers (including negative and decimal numbers)
    public static List<Double> extractNumbers(String input) {
        List<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");  // This handles: -5, 3.14, -12.75

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }

        return numbers;
    }
    public static boolean areNumbersAscending(String s) {
        List<Double> nums = extractNumbers(s);
        for(int i=1 ; i<nums.size() ; i++){
            if(!( nums.get(i-1) < nums.get(i) ) ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
}

