class Solution {
    int maxSum(int[] nums, int idx){
        int[] dp = new int[nums.length];
        int ans = Integer.MIN_VALUE;

        dp[0]=nums[0];
        ans = dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]= Math.max(dp[i-1]+ nums[i],nums[i]);
            ans = Math.max(ans,dp[i]);
        }
        return ans;


        
    }

 
    public int maxSubArray(int[] nums) {
      
        return maxSum(nums,0);
    }
}