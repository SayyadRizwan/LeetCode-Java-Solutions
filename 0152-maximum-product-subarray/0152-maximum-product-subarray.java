class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prefix *= nums[i];
            max = Math.max(max, prefix);
            if (prefix == 0) {
                prefix = 1;
            }

        }
int last=nums.length-1;
        int suffix = 1;
        int max2=Integer.MIN_VALUE;
        for (int i = last; i>=0; i--) {
            suffix *= nums[i];
            max2 = Math.max(max2, suffix);
            if (suffix == 0) {
                suffix = 1;
            }

        }
        return Math.max(max, max2 );
    }
}