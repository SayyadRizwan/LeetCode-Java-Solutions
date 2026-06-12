class Solution {

    boolean subset(int[] nums,int sum,int idx,int TotalSum, Boolean dp[][]){
        if(idx==nums.length)return false;
        if(sum>TotalSum)return false;
        if(dp[idx][sum]!=null)return dp[idx][sum];
        if(TotalSum- sum == sum) return true;

        boolean take = subset(nums,sum+nums[idx],idx+1,TotalSum,dp);
        boolean skip = subset(nums,sum,idx+1,TotalSum,dp);
        return dp[idx][sum] =  take||skip;
        
    }


    public boolean canPartition(int[] nums) {
        int sum=0;
       
        for(int num : nums){
            sum+=num;
        }
        if(sum%2==1)return false;
         Boolean dp[][] = new Boolean[nums.length][sum+1];
      return  subset(nums,0,0,sum,dp);
    }
}