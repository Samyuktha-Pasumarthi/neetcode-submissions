class Solution {
    public boolean canPartition(int[] nums) {
        int sum = sum(nums);
        int target = sum/2;

        if(sum%2 !=0){
            return false;
        }

        boolean[] dp = new boolean[target+1];
        dp[0] = true; 

        for(int i = 0;i<nums.length;i++){
            for(int j = target;j>=nums[i];j--){
                dp[j] = dp[j]||dp[j-nums[i]];
            }

        }
        return dp[target];
        
    }
    public int sum(int[] nums){
        int total = 0;
        for(int num:nums){
            total += num;
        }
        return total;
    }
}
