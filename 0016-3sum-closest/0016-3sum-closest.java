class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                   int diff =Math.abs(sum-target);
                   if(diff<min){
                    ans = sum;
                    min=diff;
                   }
                }
            }
        }
        return ans;
    }
}