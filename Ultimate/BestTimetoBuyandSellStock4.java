package DSA.Ultimate;

public class BestTimetoBuyandSellStock4 {
    public static int maxProfit(int[] prices){
        int buy = prices[0],sell = 0;
        for (int i = 0 ; i<prices.length ; i++){
            if (prices[i]-buy>sell){
                sell = prices[i] - buy;
            }
            if (prices[i]<buy){
                buy = prices[i];
            }
        }

        return sell;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
