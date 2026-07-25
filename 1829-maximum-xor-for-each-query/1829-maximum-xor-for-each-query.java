class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int ans[]= new int[nums.length];
        int target = (int)Math.pow(2,maximumBit)-1;
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            ans[ans.length-1-i]=xor^target;
            
            
        }
        return ans;
    }
}