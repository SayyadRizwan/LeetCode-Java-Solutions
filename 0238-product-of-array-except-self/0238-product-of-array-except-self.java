class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lft[] = new int[nums.length];
        int rgt[] = new int[nums.length];
        int ans[] = new int[nums.length];
        lft[0]=1;
        rgt[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            lft[i]=nums[i-1]*lft[i-1];
        }
        rgt[nums.length-1]=1;
        for(int j=nums.length-2;j>=0;j--){
            rgt[j]= rgt[j+1]*nums[j+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]= rgt[i]*lft[i];
        }
        return ans;

    }
}