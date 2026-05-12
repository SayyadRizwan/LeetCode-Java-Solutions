class Solution {
    public int maxSubArray(int[] nums) {
        int prefix[]=new int[nums.length];
        int sum=0;
        if(nums[0]>0){
            prefix[0]=nums[0];
            
        }
        else{
            prefix[0]=0;
        }
        sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prefix[i-1]+nums[i]>0){
                prefix[i]=nums[i]+prefix[i-1];
            
            }
                sum=Math.max(sum, nums[i]+prefix[i-1]);
        }
        return sum;
        
    }
}