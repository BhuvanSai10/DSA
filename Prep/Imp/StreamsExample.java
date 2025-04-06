package DSA.Prep.Imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

//        Stream<Integer> s1 = nums.stream();
//        //s1.forEach(n-> System.out.println(n)); prints the stream
//        // s1 can be used only once i.e streams can be used only once
//        //s1.forEach(n-> System.out.println(n)); // Give an error
//
//        Stream<Integer> s2 = s1.filter(n->n%2==0);  // filters all even numbers and stores in s2 stream {4,2,6}
//        Stream<Integer> s3 = s2.map(n->n*2); // doubles every element in stream {8,4,12}
//        int result = s3.reduce(0,(c, e)->c+e); // sums every element and stores in result = 24
//
//        System.out.println(result); // prints 24


        // This is shortest version of upper code
        int result = nums.stream().
                filter(n->n%2==0).
                map(n->n*2).
                reduce(0,(c,e)->c+e);

        System.out.println(result);


    }
}
