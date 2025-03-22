package DSA.Prep.ArraysAndStrings;

public class CountMaximumConsecutiveOnesInTheArray {
    public static int countMaxNoOfOnes(int[] prices){
        int max = 0;
        int count = 0;
        for(int i = 0 ; i<prices.length ; i++){
            if(prices[i]==1){
                count++;
                max = Math.max(max,count);
            }
            else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {1, 1,1,1, 0, 1, 1, 1,0,1};
        System.out.println(countMaxNoOfOnes(prices));
    }
}
