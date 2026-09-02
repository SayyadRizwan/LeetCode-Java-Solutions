class Solution {
    public int numRescueBoats(int[] nums, int limit) {
      Arrays.sort(nums);
      int i=0;
      int j=nums.length-1;
      int count=0;
      while(i<=j){
        if(nums[i]+nums[j]<=limit)i++;
        j--;
        count++;
      }
      return count;
      
    }
}