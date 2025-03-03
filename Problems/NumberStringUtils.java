package DSA.Problems;

import java.util.*;
import java.util.regex.*;

public class NumberStringUtils {

    // 1. Extract all numbers (positive/negative/decimal)
    public static List<Double> extractNumbers(String input) {
        List<Double> numbers = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            numbers.add(Double.parseDouble(matcher.group()));
        }
        return numbers;
    }

    // 2. Check if numbers are strictly ascending
    public static boolean areNumbersAscending(String input) {
        List<Double> numbers = extractNumbers(input);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) <= numbers.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 3. Sum all numbers
    public static double sumAllNumbers(String input) {
        List<Double> numbers = extractNumbers(input);
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    // 4. Replace all numbers with words (simple 0-99 for demo)
    private static final String[] words = {
            "zero", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten"
    };

    public static String replaceNumbersWithWords(String input) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            if (num >= 0 && num <= 10) {
                matcher.appendReplacement(sb, words[num]);
            } else {
                matcher.appendReplacement(sb, Integer.toString(num));  // just keep larger numbers as-is
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    // 5. Longest continuous sequence of digits
    public static String longestNumberSequence(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        String longest = "";
        while (matcher.find()) {
            String number = matcher.group();
            if (number.length() > longest.length()) {
                longest = number;
            }
        }
        return longest;
    }

    // 6. Extract phone numbers (basic)
    public static List<String> extractPhoneNumbers(String input) {
        List<String> phones = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(\\d{3}[-.]?\\d{3}[-.]?\\d{4})\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            phones.add(matcher.group());
        }
        return phones;
    }

    // 7. Parse numbers with units (like 15kg, 2.5L)
    public static List<Map<String, String>> extractNumbersWithUnits(String input) {
        List<Map<String, String>> results = new ArrayList<>();
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d+)?)([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            Map<String, String> entry = new HashMap<>();
            entry.put("value", matcher.group(1));
            entry.put("unit", matcher.group(3));
            results.add(entry);
        }
        return results;
    }

    // 8. Validate IPv4 address
    public static boolean isValidIPv4(String input) {
        String regex = "^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
        return input.matches(regex);
    }

    // 9. Find first repeated number
    public static Optional<Double> firstRepeatedNumber(String input) {
        List<Double> numbers = extractNumbers(input);
        Set<Double> seen = new HashSet<>();
        for (double num : numbers) {
            if (!seen.add(num)) {
                return Optional.of(num);
            }
        }
        return Optional.empty();
    }

    // 10. Multiply all numbers
    public static double multiplyAllNumbers(String input) {
        List<Double> numbers = extractNumbers(input);
        if (numbers.isEmpty()) return 0;
        double product = 1.0;
        for (double num : numbers) {
            product *= num;
        }
        return product;
    }

    // Example usage (main method)
    public static void main(String[] args) {
        String example = "There are 3 apples, 5.5 bananas, and 2 oranges. Also, -12 grapes.";

        System.out.println("Extract Numbers: " + extractNumbers(example));
        System.out.println("Are Numbers Ascending: " + areNumbersAscending(example));
        System.out.println("Sum All Numbers: " + sumAllNumbers(example));
        System.out.println("Replace Numbers with Words: " + replaceNumbersWithWords(example));
        System.out.println("Longest Number Sequence: " + longestNumberSequence(example));
        System.out.println("Extract Phone Numbers: " + extractPhoneNumbers("Call 123-456-7890 or 987.654.3210"));
        System.out.println("Extract Numbers with Units: " + extractNumbersWithUnits("Weight is 15kg and volume 2.5L"));
        System.out.println("Is Valid IPv4: " + isValidIPv4("192.168.1.1"));
        System.out.println("First Repeated Number: " + firstRepeatedNumber("1 2 3 2 5"));
        System.out.println("Multiply All Numbers: " + multiplyAllNumbers(example));
    }
}
