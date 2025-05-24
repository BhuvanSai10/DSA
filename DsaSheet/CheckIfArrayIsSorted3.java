package DSA.DsaSheet;

public class CheckIfArrayIsSorted3 {
    public static boolean isSorted(int[] nums){
        for (int i = 1 ; i< nums.length ; i++){
            if (!(nums[i-1]<= nums[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{1,0,3,5}));
    }
}
