class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int low = 1;
        int high = n-1;

        while(low<high){
            int mid = (low+high)/2;
            int key = 0;
            for(int i = 0;i<n;i++){
                if(nums[i]<=mid){
                    key++;
                }
            }

            if(key<=mid){
                low = mid+1;
            }
            else{
            high = mid;}
        }

        return low;

        
    }
}
