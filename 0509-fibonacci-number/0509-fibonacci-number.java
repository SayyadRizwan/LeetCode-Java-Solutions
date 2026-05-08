class Solution {
    
    int fibb(int n,int dp[]){
        if(n==1 || n==0 ){
            dp[n]=n;
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        int ans=fibb(n-2,dp)+fibb(n-1,dp);
        dp[n]=ans;
      
        return ans;
         
    }


    public int fib(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++)dp[i]=-1;
        return fibb(n,dp);

    }
}