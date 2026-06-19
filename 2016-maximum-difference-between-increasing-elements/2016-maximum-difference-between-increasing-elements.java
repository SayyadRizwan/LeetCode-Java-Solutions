class Solution {
    public int maximumDifference(int[] nums) {
        int left =0;
        int max = -1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>=left){
                left = nums[i];
            }
            else{
                max = Math.max(max,left-nums[i]);
            }
          
            
        }
        return Math.max(max,-1);
        
    }
}