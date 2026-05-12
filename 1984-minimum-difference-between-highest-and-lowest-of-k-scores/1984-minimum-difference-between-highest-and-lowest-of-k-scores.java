import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int dif = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int min = nums[i];
            int max = nums[i + k - 1];
            dif = Math.min(max - min, dif);
        }

        return dif;
    }
}
