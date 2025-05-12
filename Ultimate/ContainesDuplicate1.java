package DSA.Ultimate;

import java.util.HashSet;

public class ContainesDuplicate1 {
    public static boolean containsDuplicates(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for (int num:arr){
            if (!hs.contains(num)){
                hs.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicates(arr));
    }
}
