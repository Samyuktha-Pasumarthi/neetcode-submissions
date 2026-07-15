class Solution {
    Map<String, Integer> dp = new HashMap<>();
    public int maxProfit(int[] prices) {
        return dfs( prices, true, 0);
    }
    public int dfs(int[] prices, boolean buy, int i){
         String key = i + "-" + buy;
        if (dp.containsKey(key)) {
            return dp.get(key);
        }
        
        if(i>=prices.length){
            return 0;
        }
        
        //skipping buying or selling on that day
        int cooldown = dfs(prices, buy, i+1 );

        
        if(buy==true){
            //if i buy coin that day
            int bcost = dfs(prices, false, i+1)-prices[i];
            
            dp.put(key, Math.max(bcost, cooldown));

        }

        
        else{
            //if i sell coin that day
            int scost = dfs(prices, true, i+2)+prices[i];
            
            dp.put(key, Math.max(scost, cooldown));
        }
        
        return dp.get(key);

        
    }
}
