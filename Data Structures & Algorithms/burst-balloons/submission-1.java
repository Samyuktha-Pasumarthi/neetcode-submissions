class Solution {
    Map<String, Integer> memo = new HashMap<>();

    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] newNums = new int[n + 2];
        newNums[0] = newNums[n + 1] = 1;
        for (int i = 0; i < n; i++) {
            newNums[i + 1] = nums[i];
        }
        return dfs(newNums, 1, newNums.length - 2);
    }
   private int dfs(int[] nums, int l, int r) {
    if (l > r) return 0;

    String key = l + "," + r;

    if (memo.containsKey(key)) {
        return memo.get(key);
    }

    int ans = 0;

    for (int i = l; i <= r; i++) {
        int coins =
            nums[l - 1] * nums[i] * nums[r + 1]
            + dfs(nums, l, i - 1)
            + dfs(nums, i + 1, r);

        ans = Math.max(ans, coins);
    }

    memo.put(key, ans);
    return ans;
}
}
