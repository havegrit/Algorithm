class Solution(object):
    def maxProfit(self, prices):
        minPrice = 10001
        maxProfit = 0
        for price in prices:
            if price < minPrice:
                minPrice = price
            elif maxProfit < price - minPrice:
                maxProfit = price - minPrice
        
        return maxProfit