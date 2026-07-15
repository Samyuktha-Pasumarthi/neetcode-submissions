class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        sett = set()
        longest = 0
        l,r = 0,0

        for r in range(len(s)):
            while s[r] in sett:
                sett.remove(s[l])
                l +=1

            sett.add(s[r])
            longest = max(longest,len(sett))

        return longest

