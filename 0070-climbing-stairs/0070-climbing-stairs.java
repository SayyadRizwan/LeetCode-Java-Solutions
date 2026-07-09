class Solution {
 
int count(int n,int idx,int[] dp){
    if(idx>n){
        return 0;
    }
    if(dp[idx]!=0){
        return dp[idx];
    }
    if(idx==n){
        return 1;
    }
    return dp[idx]=count(n,idx+1,dp)+count(n,idx+2,dp);
}

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return count(n,0,dp);
    }
}