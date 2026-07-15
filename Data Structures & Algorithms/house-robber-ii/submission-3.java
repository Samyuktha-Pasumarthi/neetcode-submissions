class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        
        
        return Math.max(max(nums,0,n-2),max(nums,1,n-1));


        
    }
    public int max(int[] array, int start,int end){

        int prev1 = 0;
        int prev2 = 0;

        
        for(int i =start;i<=end;i++){
            int price = Math.max(prev1,prev2+array[i]);
            prev2 = prev1;
            prev1 = price;
        }
        return prev1;
    }
}
