class Solution {

    int[][] dp;

    int solve(int[] nums, int idx, int prev) {

        if (idx == nums.length)
            return 0;

        if (dp[idx][prev + 1] != -1)
            return dp[idx][prev + 1];

        int take = 0;

        if (prev == -1 || nums[idx] > nums[prev]) {
            take = 1 + solve(nums, idx + 1, idx);
        }

        int skip = solve(nums, idx + 1, prev);

        return dp[idx][prev + 1] = Math.max(take, skip);
    }

    public int lengthOfLIS(int[] nums) {

        dp = new int[nums.length][nums.length + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(nums, 0, -1);
    }
}