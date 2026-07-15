class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer,Integer> dp = new HashMap<>();
        dp.put(0,1);

        for(int num:nums){
            Map<Integer,Integer> dp2 = new HashMap<>();
            for(Map.Entry<Integer,Integer> entry : dp.entrySet()){
                int total = entry.getKey();
                int count = entry.getValue();
                dp2.put(total+num, dp2.getOrDefault(total+num,0)+count);
                 dp2.put(total-num, dp2.getOrDefault(total-num,0)+count);

            }
            dp=dp2;
        }
        return dp.getOrDefault(target,0);
        
    }
}
