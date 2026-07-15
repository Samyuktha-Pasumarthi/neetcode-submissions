class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        int maxProd = 1;
        int minProd = 1;

        if(nums.length ==1){
            return nums[0];
        }

        for(int num:nums){
            int tmp = maxProd*num;
            maxProd = Math.max(num,Math.max(tmp,minProd*num));
            minProd = Math.min(num,Math.min(tmp,minProd*num));
            res = Math.max(res,maxProd);
        }
        return res;
        
    }
}
