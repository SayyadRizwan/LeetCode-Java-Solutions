class Solution {
    public int singleNonDuplicate(int[] nums) {
        int var=nums[0];
        for(int i=1;i<nums.length;i++){
            var^=nums[i];
        }
        return var;
    }
}