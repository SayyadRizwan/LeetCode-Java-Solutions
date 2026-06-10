class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap = ((m+n)/2) + ((m+n)%2);
        for(int i = 0;i<n;i++){
            nums1[i + m] = nums2[i];
        }
        while(gap>0){
            int st = 0;
            int nxt = gap;
           
           while(nxt<m+n){
            if(nums1[st]>nums1[nxt]){
                int temp = nums1[st];
                nums1[st]=nums1[nxt];
                nums1[nxt]=temp;
            }
            
            nxt++;
            st++;
           }
             if(gap==1)break;
           gap = (gap/2)+(gap%2);
          
        }
    }
}