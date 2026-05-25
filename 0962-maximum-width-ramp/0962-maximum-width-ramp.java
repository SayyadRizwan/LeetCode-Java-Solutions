class Solution {
    public int maxWidthRamp(int[] nums) {
        int pref[] = new int[nums.length];
        int max = 0;
        for(int i=nums.length-1;i>=0;i--){
            max= Math.max(nums[i],max);
            pref[i]=max;
        }
        max=0;
        int count = 0;
      
        for(int i= 0;i<nums.length;i++){
            for(int j=count;j<nums.length;j++){
                

                
               if(pref[j]>=nums[i]){

                   max=Math.max(j-i,max);
                    }

                else{
                    
                    break;
                }
              count=j;

                
            }
        if(count==nums.length-1)return max;
            

            
        }

    return 0;
        
    }
}