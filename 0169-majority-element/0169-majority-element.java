class Solution {
    public int majorityElement(int[] nums) {
        int var = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {

            if (var == nums[i]) {
                count++;
            }
            if (var != nums[i]) {
                count--;
            }
            if (count <= 0) {
                var = nums[i];
                count=1;
            }
        }
        return var;
    }
}