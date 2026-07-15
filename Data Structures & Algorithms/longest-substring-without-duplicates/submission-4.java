class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> seen = new HashMap<>();
        int l = 0;
        int res = 0;

        for(int r=0;r<s.length();r++){
            if(seen.containsKey(s.charAt(r))){
                l = Math.max(seen.get(s.charAt(r))+1,l);
            }
            seen.put(s.charAt(r),r);
            res = Math.max(res,r-l+1);
        }
        return res;
        
    }
}
