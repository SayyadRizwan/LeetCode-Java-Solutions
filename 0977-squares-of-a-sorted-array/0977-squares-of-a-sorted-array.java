class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[] = new int[nums.length];
        if(ans.length==1){
            ans[0]= nums[0]* nums[0];
            return ans;
        }
        int neg=0;
        int pos=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0)pos++;
            else{
                neg++;
            }
        }
        int count=0;
        int i=neg-1;
        int j= neg;
        while(i<j){
            if(i<0 || j>=nums.length)break;
            if(nums[j]<=(-1*nums[i])){
                ans[count]=nums[j]*nums[j];
                j++;
            }
            else{
                  ans[count]=nums[i]*nums[i];
                  i--;
            }
            count++;
        }
        while(i>=0){
            ans[count]=nums[i]*nums[i];
            i--;
            count++;
        }
        while(j<nums.length){
            ans[count]=nums[j]* nums[j];
            j++;
            count++;
        }

        
     
        return ans;
    }
}