class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==0){
                nums[i]=nums[start];
                nums[start]=0;
                start++;
                
            }
        }
        while(nums[end]==2 && end!=start){
            end--;
            
        }
        for(int i=end;i>=start;i--){
            if(nums[i]==2){
                nums[i]=nums[end];
                nums[end]=2;
                end--;
                
            }
        
    }
}
}