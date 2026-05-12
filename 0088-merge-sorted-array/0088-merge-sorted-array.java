class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int ans[]=new int[nums1.length];
        int count=0;
        while(i<m && j<n&&count<ans.length){
     if(nums1[i]<nums2[j]){
         ans[count]=nums1[i];
         i++;
         count++;
     }
            else{
                ans[count]=nums2[j];
         j++;
                count++;
            }
            
         /*   if(count==ans.length-1){
                nums1=ans;
                return;
            } */
            
        }
        while(i<m){
            ans[count]=nums1[i];
         i++;
            count++;
        }
        while(j<n){
            ans[count]=nums2[j];
         j++;
            count++;
        }
        helper(ans,nums1);
 
}
void helper(int ans[],int nums1[]){
    for (int k = 0; k < ans.length; k++) {
            nums1[k] = ans[k];
    }
}
    
}