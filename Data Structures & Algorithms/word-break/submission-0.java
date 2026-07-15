class Solution {
    Map<String, Boolean> dp = new HashMap<>();
    
    public boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s, wordDict);
        
    }
    public boolean dfs(String s, List<String> wordDict){
        if (dp.containsKey(s)){
            return dp.get(s);
        }
        if (s.length() == 0){
            return true;
        }
         for (String word : wordDict) {

            if (s.startsWith(word)) {

                String remaining = s.substring(word.length());

                if (dfs(remaining, wordDict)) {
                    dp.put(s, true);
                    return true;
                }
            }
        }

        dp.put(s, false);
        return false;
    }
}
