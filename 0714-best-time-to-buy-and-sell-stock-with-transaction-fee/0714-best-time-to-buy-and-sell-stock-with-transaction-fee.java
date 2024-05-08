class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        //return helperMaxProfit(prices,0,1,fee);
        // int[][]dp = new int[prices.length+1][2];

        // for(int[]row : dp)
        // {
        //     Arrays.fill(row,-1);
        // }
        
        // return helperMaxProfit(prices,0,1,fee,dp);

        return helperMaxProfit(prices,fee);

    }

    public int helperMaxProfit(int[]prices,int index,int buy, int fee,int[][]dp)
    {
        if(index == prices.length)
          return 0;
        
        if(dp[index][buy] != -1)
           return dp[index][buy];

        int profit = 0;
        if(buy == 1)
        {
            int buyIt = (-prices[index]) + helperMaxProfit(prices,index+1,0,fee,dp);
            int ignoreIt = 0 + helperMaxProfit(prices,index+1,1,fee,dp);

            profit = Math.max(buyIt,ignoreIt); 

        } 
        else{

            int sellIt = prices[index] + helperMaxProfit(prices,index+1,1,fee,dp) - fee;
            int ignoreIt = 0 + helperMaxProfit(prices,index+1,0,fee,dp);

            profit = Math.max(sellIt, ignoreIt);

        }
        
        dp[index][buy] = profit;
        return dp[index][buy];

    }
    
    public int helperMaxProfit(int[]prices,int fee)
    {
        int[][]dp = new int[prices.length+1][2];

        for(int[]row : dp)
            Arrays.fill(row,0);

         for(int index = prices.length-1; index>=0; index--)
         {
            for(int buy = 0; buy< 2;buy++)
            {
                int profit = 0;
                if(buy == 1){
                int buyIt = (-prices[index]) + dp[index+1][0];
                int ignoreIt = 0 + dp[index+1][1];

                profit = Math.max(buyIt,ignoreIt); 
                } 
                else{

                  int sellIt = prices[index] + dp[index+1][1] - fee;
                  int ignoreIt = 0 + dp[index+1][0];

                  profit = Math.max(sellIt, ignoreIt);

                }

                dp[index][buy] = profit;

            }
         }
         return dp[0][1];    
        
    }


}