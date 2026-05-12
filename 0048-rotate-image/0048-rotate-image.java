class Solution {
    public void rotate(int[][] matrix) {
        int nums[][]=new int[matrix.length][matrix.length];
            for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
           nums[i][j]=matrix[nums.length-j-1][i];
           }
       }
        for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
          // nums[i][j]=nums[nums.length-j-1][i];
               matrix[i][j]=nums[i][j];
           }
       }
    
    }
}