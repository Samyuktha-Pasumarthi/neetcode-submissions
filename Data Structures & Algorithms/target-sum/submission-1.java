class Solution {
    Map<String,Integer> dp = new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(nums,target,0,0);
        
    }
    public int dfs(int[] nums, int target, int i, int sum){
        String key = sum + ","+i;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        if(sum==target && i==nums.length){
            return 1;
        }
        if(sum!=target && i==nums.length){
            return 0;
        }
        int res = dfs(nums,target,i+1,sum-nums[i])+dfs(nums,target,i+1,sum+nums[i]);
        dp.put(key,res);
        return res;

    }
}
