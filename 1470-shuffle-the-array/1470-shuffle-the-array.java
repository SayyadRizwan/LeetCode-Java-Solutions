class Solution {
    public int[] shuffle(int[] nums, int n) {
       int fp=0;
       int sp=nums.length/2;
       int ans[]= new int[nums.length];
       for(int i=0;i<nums.length;i++) {
        ans[i]=nums[fp];
        ans[i+1]=nums[sp];
        i++;
        fp++;
        sp++;

       }
       return ans;
    }
}