class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int arr[]={-1,-1};
        if(nums.length==1){
        if(nums[0]==target){
            arr[0]=0;
            arr[1]=0;
        }
            else{
                return arr;
            }
            
        }
        int low=0;
        int high=nums.length-1;
        int mid=low+(high-low)/2;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){int left = mid;
                while (left > 0 && nums[left - 1] == target) {
                    left--;
                }

                // Expand to the right
                int right = mid;
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right++;
                }

                arr[0] = left;
                arr[1] = right;
                return arr; 
                
           //     Arrays.sort(arr);
        //        return arr;
            }
            if(nums[mid]<target){
                 low = mid+1;
            }
            if(nums[mid]>target){
                high=mid-1;
            }
        }
        return arr;
        
    }
}