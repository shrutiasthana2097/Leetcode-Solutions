//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Solution {
    public int maxProfit(int[] prices) {
        int leftIndex = 0;
        int rightIndex = 1;
        int maxprofit = 0;

        while(rightIndex < prices.length)
        {
            
            if(prices[leftIndex] < prices[rightIndex])
            {
                int profit = prices[rightIndex] - prices[leftIndex];
                maxprofit = Math.max(maxprofit,profit);
            }
            else
            {
                leftIndex=rightIndex;
                
            }  
            rightIndex = rightIndex + 1;          
        }
        return maxprofit;
        }
    }
