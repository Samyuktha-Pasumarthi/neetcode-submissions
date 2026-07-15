class Solution {
    int res = 0;
    Map<String,Integer> dp = new HashMap<>();
    public int longestCommonSubsequence(String text1, String text2) {
        return dfs(text1,text2,0,0);
        
    }
    public int dfs(String text1, String text2,int i,int j){
        String key = i+"," +j;
        if (dp.containsKey(key)){
            return dp.get(key);
        }
        if(i>=text1.length()||j>=text2.length()){
            return 0;
        }
        if(text1.charAt(i)==text2.charAt(j)){
            res = 1+dfs(text1,text2,i+1,j+1);
        }
        else{
            res = Math.max(dfs(text1,text2,i+1,j),dfs(text1,text2,i,j+1));
        }
        dp.put(key,res);
        return res;
        
    }

}
