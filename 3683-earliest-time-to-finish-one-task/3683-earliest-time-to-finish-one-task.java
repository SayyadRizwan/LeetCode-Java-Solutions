class Solution {
    public int earliestTime(int[][] tasks) {
                   int num=tasks[0][0]+tasks[0][1];
       for(int i=0;i<tasks.length;i++){
           int sum=tasks[i][0]+tasks[i][1];
            if((sum)<num) num=sum;
           
       }
        return num;
    }
}