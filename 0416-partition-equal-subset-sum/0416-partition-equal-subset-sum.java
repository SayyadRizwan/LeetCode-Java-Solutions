class Solution {
    boolean partitionEligible(int[] nums,int idx,int sum){
        if(idx>=nums.length)return false;
        if(sum==0)return true;
        if(sum<0)return false;
        if(dp[idx][sum]!=null)return dp[idx][sum];
        boolean take = partitionEligible(nums,idx+1,sum-nums[idx]);
        boolean skip = partitionEligible(nums,idx+1,sum);
        return dp[idx][sum] = take || skip;

    }
    Boolean[][] dp ;
    public boolean canPartition(int[] nums) {
        int sum=0;
          for(int num: nums)sum+=num;
        dp = new Boolean[nums.length+1][sum];
        
      
        if(sum%2!=0)return false;
        return partitionEligible(nums,0,sum/2);
        
    }
}