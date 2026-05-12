class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int st=0;
        int end=nums.length-1;
        long sum=0;
        while(st<end){
            sum+=nums[end-1];
            st++;
            end-=2;
        }
        return sum;
    }
}