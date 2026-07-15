class Solution {
    Map<String,Boolean> dp = new HashMap<>();
    public boolean isMatch(String s, String p) {
        return dfs(s,p,0,0);
        
    }
    public boolean dfs(String s, String p,int i,int j){
        
       if (j == p.length())
    return i == s.length();

    String key = i+","+j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }

boolean firstMatch =
    i < s.length() &&
    (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

    boolean ans;

if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
     ans =  dfs(s, p, i, j + 2) ||
           (firstMatch && dfs(s, p, i + 1, j));
}
else{

    ans = firstMatch && dfs(s, p, i + 1, j + 1);

}

dp.put(key,ans);
return ans;


        
    }  
}

