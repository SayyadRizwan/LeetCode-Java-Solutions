class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int[] maxDP = new int[n];
        int[] minDP = new int[n];

        maxDP[0] = nums[0];
        minDP[0] = nums[0];

        int ans = nums[0];

        for (int i = 1; i < n; i++) {

            if (nums[i] >= 0) {
                maxDP[i] = Math.max(nums[i], maxDP[i - 1] * nums[i]);
                minDP[i] = Math.min(nums[i], minDP[i - 1] * nums[i]);
            } else {
                maxDP[i] = Math.max(nums[i], minDP[i - 1] * nums[i]);
                minDP[i] = Math.min(nums[i], maxDP[i - 1] * nums[i]);
            }

            ans = Math.max(ans, maxDP[i]);
        }

        return ans;
    }
}