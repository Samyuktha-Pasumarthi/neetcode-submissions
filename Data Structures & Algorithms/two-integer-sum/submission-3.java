class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> A = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            A.put(nums[i],i);
        }
        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if (A.containsKey(diff) && A.get(diff) != i){
                return new int[]{i,A.get(diff)};
            }
        }

        return new int[0];
    }
}
