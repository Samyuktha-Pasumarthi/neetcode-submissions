class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];

        for(int i = 0;i<n-1;i++){
            arr1[i]=nums[i];
        }
        for(int j = 0;j<n-1;j++){
            arr2[j]=nums[j+1];
        }

        int price1 = max(arr1);
        int price2 = max(arr2);

        return Math.max(price1,price2);


        
    }
    public int max(int[] array){
        int l = array.length;

        int prev1 = 0;
        int prev2 = 0;

        if(l==1){
            return array[0];
        }

        for(int i =0;i<l;i++){
            int price = Math.max(prev1,prev2+array[i]);
            prev2 = prev1;
            prev1 = price;
        }
        return prev1;
    }
}
