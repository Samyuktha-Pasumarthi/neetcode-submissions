class Solution {
    Map<String,Integer> dp = new HashMap<>();
    public int minDistance(String word1, String word2) {
        int m = word1.length()-1;
        int n = word2.length()-1;
        return dfs(word1,word2,m,n);
        
    }
    public int dfs(String w1, String w2,int i,int j){
        int res;
        String key = i + ","+j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        if(j<0){
            return i+1;
        }
        if(i<0){
            return j+1;
        }
        if(w1.charAt(i)==w2.charAt(j)){
            res = dfs(w1,w2,i-1,j-1);
        }
        else{
            int insert = dfs(w1,w2,i,j-1);
            int delete = dfs(w1,w2,i-1,j);
            int replace = dfs(w1,w2,i-1,j-1);
            
            res = 1+Math.min(insert,Math.min(delete,replace));
        }
        dp.put(key,res);
        return res;
    }
}
