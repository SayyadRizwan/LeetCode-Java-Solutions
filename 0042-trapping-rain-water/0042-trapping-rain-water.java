class Solution {
  
        
        



    public int trap(int[] height) {
        if (height.length < 3) return 0;
        int max = 0;
        int[] LeftMax = new int[height.length];
       for(int i = 1;i<height.length;i++){
        max = LeftMax[i]=Math.max(height[i-1],max);
       }
       max = 0;
           int[] RightMax = new int[height.length];
       for(int i = height.length-2;i>0;i--){
        max = RightMax[i]=Math.max(height[i+1],max);
       }
        int sum =0;
        for(int i=1;i<height.length-1;i++){
           sum += Math.max(0, Math.min(LeftMax[i], RightMax[i]) - height[i]);
            
        }
        return sum;



    }
}