class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);

        int res = 1;

        for(int i = 1;i<nums.length;i++){

            if(dp.get(dp.size()-1)<nums[i]){
                dp.add(nums[i]);
                res++;
            }
            else{
                int replace = Collections.binarySearch(dp,nums[i]);
                if(replace<0){
                    replace = -replace-1;
                }
                dp.set(replace,nums[i]);
            }

            
        }
        
        return res;

        
    }
}
