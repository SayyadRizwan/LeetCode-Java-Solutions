class Solution {

    int minCost(int[] cost, int idx,int dp[]){
        if(idx>=cost.length)return 0;
        if(dp[idx]!=-1)return dp[idx];
        int st= minCost(cost,idx+1,dp) + cost[idx];
        int sk = minCost(cost,idx+2,dp)+ cost[idx];
        dp[idx]=Math.min(st,sk);
        return dp[idx] ;
    }

    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
    }
}