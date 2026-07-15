class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l= 0
        max_prof = 0
        for r in range(1,len(prices)):
            if prices[l]<prices[r]:
                profit = prices[r]-prices[l]
                max_prof = max(max_prof,profit)

            else:
                l=r
            

        return max_prof
        