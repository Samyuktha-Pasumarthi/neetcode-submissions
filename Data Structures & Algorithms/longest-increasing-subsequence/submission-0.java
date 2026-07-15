class Solution {
    Map<String,Integer> dp = new HashMap<>();
    public int lengthOfLIS(int[] nums) {
        return dfs(nums,0,-1);
    }
    public int dfs(int[] nums, int i, int j){
        
        String key = i + "," + j;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        
        if(i==nums.length){
            return 0;
        }

        //not include
        int LIS = 0+dfs(nums,i+1,j);

        //include
        if(j==-1|| nums[j]<nums[i]){
            LIS = Math.max(LIS, 1+dfs(nums,i+1,i));
        }
        dp.put(key, LIS);
        return LIS;
    }

}
