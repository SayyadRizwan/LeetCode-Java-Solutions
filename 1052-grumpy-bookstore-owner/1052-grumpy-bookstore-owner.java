class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int size =0;
        int swSum =0;
        int maxSum=0;
        int sum=0;
        for(int i=0;i<customers.length;i++){
            int curr = customers[i];
            int state = grumpy[i];
            int flag = (state==0) ? 1 : 0;
            sum+=flag*curr;
            if(size<minutes){
                size++;
                if(state==1)swSum+=curr;
            }
            else{
                if(grumpy[i-minutes]==1){
                    swSum-=customers[i-minutes];
                    

                }
                if(state==1)swSum+=curr;
            }
            maxSum = Math.max(maxSum,swSum);
        }
        return sum+maxSum;
    }
}