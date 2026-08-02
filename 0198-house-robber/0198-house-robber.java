class Solution {
    int maxPaisa(int[] nums , int idx){
        if(idx>=nums.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int take = maxPaisa(nums,idx+2)+ nums[idx];
        int skip = maxPaisa(nums,idx+1) ;
        return dp[idx]=Math.max(take,skip);


    }
    int[] dp ;

    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return maxPaisa(nums,0);
    }
}