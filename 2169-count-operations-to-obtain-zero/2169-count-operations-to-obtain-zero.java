class Solution {
    int count(int num1,int num2,int sum){
        if(num1==0 || num2==0){
            return sum;
        }
        return (num1<num2)? count(num1,num2-num1,sum+1) : count(num1-num2,num2,sum+1);



    }


    public int countOperations(int num1, int num2) {
        return count(num1,num2,0);
    }
}