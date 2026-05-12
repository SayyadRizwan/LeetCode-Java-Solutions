class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        int val=-1;
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;
        while(low<=high){
        //      if(low==high){
        //     val=-1;
        //     break;
        // }
        if(nums[mid]==target){
            val=mid;
            break ;
        }
        if(nums[mid]<target){
            low=mid+1;
            mid=(low+high)/2;
        }
        if(nums[mid]>target){
            high=mid-1;
            mid=(low+high)/2;
        }
        }
        return val;
    }
}