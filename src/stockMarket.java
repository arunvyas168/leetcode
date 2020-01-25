/**
 * Created by arunvyasnarayanan on 1/22/20.
 * Say you have an array for which the ith element is the price of a given stock on day i.

 If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

 Note that you cannot sell a stock before you buy one.

 Example 1:

 Input: [7,1,5,3,6,4]
 Output: 5
 Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 Not 7-1 = 6, as selling price needs to be larger than buying price.
 Example 2:

 Input: [7,6,4,3,1]
 Output: 0
 Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */

public class stockMarket {
    public static int findMaxProfit(int[] stockPriceList){

        //at index 0 profit is 0 (buy and sell same price)
        int profit = 0;
        //keep track of min price
        int min_price = Integer.MAX_VALUE;

        // Since we keep trackk of min price --- calculate profit for each index --- keep track of max profit
        for (int i=0; i<stockPriceList.length; i++){
            if(stockPriceList[i]<min_price){
                min_price = stockPriceList[i];
            }else {
                profit = Math.max(profit, (stockPriceList[i]-min_price));
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int [] stockPriceList = new int[]{7, 1, 5, 3, 6, 4};
        int profit = findMaxProfit(stockPriceList);
        System.out.println("max profit is: "+profit);
    }
}

