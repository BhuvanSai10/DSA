package DSA.Problems;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int pricesSize = prices.length;
        int buy=prices[0],sell=0;
        for(int i=0;i<pricesSize;i++){
            if(prices[i]-buy>sell){
                sell = prices[i]-buy;
            }
            if(prices[i]<buy){
                buy = prices[i];
            }
        }

        return sell;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
