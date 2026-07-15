class Solution {
    Map<String,Boolean> dp = new HashMap<>();
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        int target = sum/2;
        if(sum%2 != 0){
            return false;
        }

        return dfs(nums, target, 0);
        
        
    }
    public boolean dfs(int[] nums,int target,int i){
        String key = target + ","+i;
        if (dp.containsKey(key)){
            return dp.get(key);
        }
        boolean res = false;
        if(i==nums.length){
            
            if (target==0){
                res = true;
            }
            dp.put(key,res);
            return res;
        }
        if(target<0){
            res = false;
            dp.put(key,res);
            return res;
        }
         res = dfs(nums,target,i+1)||dfs(nums,target-nums[i],i+1);
         dp.put(key,res);
         return res;
        
        

    }
}
