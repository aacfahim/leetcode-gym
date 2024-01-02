//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

// Time O(n), Space O(1)

class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }

        return profit;

        
    }
}
