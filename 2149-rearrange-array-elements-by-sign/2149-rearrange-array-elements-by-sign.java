class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums.length<=0){
            return nums;
        }
        int[] arr1=new int[nums.length/2];
    int count1 = 0, count2 = 0;    
        int[] arr2=new int[nums.length/2];
        
        for(int num:nums){
            if(num>=0){
                arr1[count1]=num;
                count1++;
            }

       if(num<0){
           arr2[count2]=num;
           count2++;
       }
    
        }
        int count3=0;     

        for(int i=0;i<nums.length;i+=2){

            nums[i]=arr1[count3];
            
            nums[i+1]=arr2[count3];
            count3++;
        }
        return nums;
        
    }
}