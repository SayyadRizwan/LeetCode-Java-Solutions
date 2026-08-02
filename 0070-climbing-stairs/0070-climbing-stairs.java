class Solution {
    int wayCount(int n){
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]!=-1)return dp[n];
        int take = wayCount(n-1);
        int take2 = wayCount(n-2);
        return dp[n]=take + take2;

    }
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return wayCount(n);
    }
}