class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> A = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;

            if(A.containsKey(diff)){
                return new int[]{A.get(diff),i};
            }

        A.put(num,i);
        }

        return new int[] {};


    }
}
