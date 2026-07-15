class Solution {
    Map<String,Integer> dp = new HashMap<>();
    public int change(int amount, int[] coins) {
        return dfs(amount,coins,0);
        
    }
    public int dfs(int amount, int[] coins, int i){
        int sum;
        String key = amount + "," + i;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        if(i>=coins.length){
            return 0;
        }
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        
        
        sum = dfs(amount-coins[i],coins,i)+dfs(amount,coins,i+1);
        dp.put(key,sum);
        return sum;
    }
}
