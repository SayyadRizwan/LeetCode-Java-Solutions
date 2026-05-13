class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int ans=0;
      int max=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            ans+=1;
        
        }
        else{
            ans=0;
        }
        max=Math.max(ans,max);
       
      }
       return max;  
    }
}