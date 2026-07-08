class Solution {

    static int rotatedSearch(int[] nums , int target, int low , int high){


          if(low>high){
            return -1;
        }
        int mid  = low+(high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
      
        //left part sorted
        if(nums[low]<=nums[mid] ){
            if(target>=nums[low] && nums[mid]>=target){
               return rotatedSearch(nums,target,low,mid-1);
            }
            else{
                return rotatedSearch(nums,target,mid+1,high);
            }
        }
        else{
            if(target>=nums[mid] && target<=nums[high]){
                return rotatedSearch(nums,target,mid+1,high);
            }
            else{
                return rotatedSearch(nums,target,low,mid-1);
            }

        }
       



    }

    public int search(int[] nums, int target) {
        return rotatedSearch(nums,target,0,nums.length-1);
    }
}