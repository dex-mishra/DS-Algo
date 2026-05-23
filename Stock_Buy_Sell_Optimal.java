public class Stock_Buy_Sell_Optimal {

    public int maxProfit(int[] prices) {
        int maxProfit=0,buy=prices[0],sell=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            sell = prices[i];
            int profit = sell-buy;
            if(profit>maxProfit)
                maxProfit=profit;
        }
        return maxProfit;
    }
}
