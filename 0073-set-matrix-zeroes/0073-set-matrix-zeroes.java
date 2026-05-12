class Solution {
    public void setZeroes(int[][] matrix) {
        boolean row[]=new boolean[matrix[0].length];
        boolean col[]=new boolean[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==0){
                  row[j]=true;
                  col[i]=true;
              }  
            } }
            for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(row[j]==true||col[i]==true){
                  matrix[i][j]=0;
              }
              }  
            }
        
    }
}