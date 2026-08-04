class Solution {
    int max = Integer.MAX_VALUE;
    int minimumSum(int[][] grid,int m,int n){
        if(m>=grid.length || n>=grid[0].length)return 50000;
        if(m==grid.length-1 && n==grid[0].length-1)return grid[m][n];
        if(dp[m][n]!=-1)return dp[m][n];
        int down = minimumSum(grid,m+1,n) + grid[m][n] ;
        int right = minimumSum(grid,m,n+1) + grid[m][n];
        return dp[m][n]=Math.min(down,right);

    }
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length +1][grid[0].length+1];
        for(int arr[] : dp)Arrays.fill(arr,-1);
        return minimumSum(grid,0,0);
    }
}