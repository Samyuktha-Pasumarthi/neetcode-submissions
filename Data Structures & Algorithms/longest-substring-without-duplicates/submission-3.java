class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int l = 0;
        int res = 0;
        for(int r = 0;r<s.length();r++){
            while(seen.contains(s.charAt(r))){
                
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            res = Math.max(r-l+1,res);
        }
        return res;

    }
}
