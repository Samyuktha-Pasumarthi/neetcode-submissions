class Solution {
    Map<String, Integer> dp = new HashMap<>();
    public int numDistinct(String s, String t) {
        return dfs(s,t,0,0);
        
    }
    public int dfs(String s,String t, int i, int j){
        String key = i+","+j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }

        if(j==t.length()){
            return 1;

        }
        if(i==s.length()){
            return 0;
        }
        int res = 0;
        if(s.charAt(i)==t.charAt(j)){
            res = dfs(s,t,i+1,j+1);
            
        }
        res += dfs(s,t,i+1,j);
        dp.put(key,res);
        return res;
    }

}
