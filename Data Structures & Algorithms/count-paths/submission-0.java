class Solution {
    Map<String,Integer> dp = new HashMap<>();
    public int uniquePaths(int m, int n) {
        return dfs(m,n,0,0);
        
    }

    public int dfs(int m, int n,int i, int j){
        if(i>=m||j>=n){
            return 0;
        }
        String key = i + "," + j;
        if (dp.containsKey(key)){
            return dp.get(key);
        }
        
        if(i==m-1&&j==n-1){
            return 1;
        }

        int res = dfs(m,n,i+1,j)+dfs(m,n,i,j+1);
        dp.put(key,res);
        return res;
    }
}
