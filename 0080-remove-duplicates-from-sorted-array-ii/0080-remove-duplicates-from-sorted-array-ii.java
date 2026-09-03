class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = nums[0];
        int freq = 1;
        int count=0;
       int i=2;
       int j=2;
       while(j<nums.length){
        if(nums[j]!=nums[i-2]){
            nums[i]=nums[j];
            i++;
            count++;
        }
        j++;

       }
       return i;
    }

}