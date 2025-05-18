package DSA.Ultimate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DuplicateNums {
    public static ArrayList<Integer> findDuplicates(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int num:arr){
            if (hs.contains(num)){
                duplicates.add(num);
            }else{
                hs.add(num);
            }

        }
        return duplicates;
    }

    public static void findFreq(int[] arr){
        Map<Integer,Integer> freq = new HashMap<>();
        for (int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 1, 3, 6, 6};
//        System.out.println(findDuplicates(arr));
        findFreq(arr);
    }
}
