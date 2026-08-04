class Solution {
    int totalWays(int[] nums , int amount , int idx){
        if(idx>=nums.length || amount<0)return 0;
        if(amount==0)return 1;
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        int take = totalWays(nums,amount-nums[idx],idx);
        int skip = totalWays(nums,amount,idx+1);
        return dp[idx][amount]=take + skip;
    }
    int[][] dp;
    public int change(int amount, int[] coins) {
           dp = new int[coins.length+1][amount+1];
        for(int[] arr : dp)Arrays.fill(arr,-1);
     
        return totalWays(coins,amount,0);
    }
}