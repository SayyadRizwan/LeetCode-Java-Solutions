class Solution {
    int max = Integer.MAX_VALUE;


    int coinCount(int[] nums,int sum,int idx ){
    
      if(idx>= nums.length )return max;
      if(sum==0)return 0;
      if(sum<0)return max;
      int take = max;
      String str = idx + "," + sum;
    if(hm.containsKey(str))return hm.get(str);


if (nums[idx] <= sum) {
    take = coinCount(nums, sum - nums[idx], idx);

    if (take != max)
        take = 1 + take;
}
      int skip = coinCount(nums,sum,idx+1);
      int ans =  Math.min(take,skip);
      hm.put(str,ans);
      return ans;
      
      

      


    }
   
    HashMap<String,Integer> hm  = new HashMap<>();
    public int coinChange(int[] coins, int amount) {
    
        
       int ans = coinCount(coins,amount,0);
       return(ans==max)? -1 : ans;
        
    }
}