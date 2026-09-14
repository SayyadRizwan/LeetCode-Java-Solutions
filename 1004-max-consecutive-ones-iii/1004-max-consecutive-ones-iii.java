class Solution {
    public int longestOnes(int[] nums, int k) {
      int left=0;
      int right =0;
      int winSize =0;
      int count =0;
      int maxWin =0;
      while(right<nums.length){
        if(nums[right]==1)count++;
        int temp = left;
         right++;
        winSize = right-left;
        if(winSize-count>k){
            left++;
            if(nums[temp]==1)count--;
        }
          winSize = right-left;
        maxWin = Math.max(maxWin,winSize);

      }
      return maxWin;  
    }
}