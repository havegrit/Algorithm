class Solution {
    public int maxProfit(int[] prices) {
        int buyDate = 0;
        int sellDate = 0;
        int totalProfit = 0;
        int maxProfit = 0;
        int cnt = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            buyDate = 0;
            cnt++;
            sellDate = cnt;
            totalProfit += getTradeProfit(prices[buyDate], prices[sellDate]);
            for (int j = i + 1; j < prices.length; j++){
                buyDate = sellDate;
                sellDate = j;
                totalProfit += getTradeProfit(prices[buyDate], prices[sellDate]);
            }
            sellDate = 0;
            if (totalProfit > maxProfit) {
                maxProfit = totalProfit;
            }
            totalProfit = 0;
        }

        return maxProfit;
    }
    
    public int getTradeProfit(int buyPrice, int sellPrice) {
        int tradeDelta = sellPrice - buyPrice;
        if (tradeDelta <= 0) {
            return 0;
        }
        return tradeDelta;
    }
}