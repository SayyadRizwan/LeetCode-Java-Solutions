class Solution {
    public int removeDuplicates(int[] nums) {
     int ctr = 1;
     int val = nums[0];
     
     for(int i=1;i<nums.length;i++){
        if(nums[i]>val){
            nums[ctr]=nums[i];
            val = nums[i];

            ctr++;

        }

     }
     return ctr;   
    }
}