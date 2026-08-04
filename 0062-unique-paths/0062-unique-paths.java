class Solution {
    int totalPath(int m,int n){
        if(m<0 || n<0)return 0;
        if(m==0 && n==0)return 1;
        if (dp[m][n]!=-1)return dp[m][n];
        int down = totalPath(m-1,n);
        int right = totalPath(m,n-1);
        return dp[m][n]=down+ right;
    }
        int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int[] arr: dp)Arrays.fill(arr,-1);
        return totalPath(m-1,n-1);
    }
}