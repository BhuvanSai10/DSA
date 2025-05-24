package DSA.DsaSheet;

public class MaxConsecutiveOnes10 {
    public static int findMaxConsecutiveOnes(int[] arr){
        int maxCount = 0;
        int count = 0;

        for (int i = 0  ; i<arr.length ; i++){

            if (arr[i]==1){
                count++;
            }
            else {
                count = 0;
            }
            if (count>maxCount){
                maxCount = count;
            }
        }

        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }
}
