class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr= new int[2*nums.length];
        
      for(int i=0;i<nums.length;i++){
          int len = arr.length;
          arr[i]=nums[i];
          arr[len-i-1]=nums[i];
      }  
        return arr;
    }
}