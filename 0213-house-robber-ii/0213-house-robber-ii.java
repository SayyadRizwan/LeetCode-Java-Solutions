class Solution {
    int maxPaisa(int[] nums,int idx,int flag){
        if(idx>=nums.length)return 0;
        int take =0;
      if(dp[idx][flag]!=-1)return dp[idx][flag];
        if(idx==0){

   
     take = maxPaisa(nums,idx+2,1)+ nums[idx];
  
        }
       else if(idx==nums.length-1 ){
        if(flag==1){
            take=0;
            return 0;
        }
            take=  maxPaisa(nums,idx+2,flag)+ nums[idx];
        }
        else{
  take=  maxPaisa(nums,idx+2,flag)+ nums[idx];
        }
        int skip = maxPaisa(nums,idx+1,flag);
        return dp[idx][flag]= Math.max(take,skip);
        
    }
int[][] dp ;
    public int rob(int[] nums) {
        dp = new int[nums.length+1][2];
        for(int[] arr : dp)Arrays.fill(arr,-1);

        return maxPaisa(nums,0,0);
    }
}