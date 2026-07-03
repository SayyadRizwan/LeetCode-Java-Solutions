class Solution {

    int stepCount(int num ){
        if(num == 0)return 0;
        return (num  % 2 == 0) ? (stepCount(num/2)+1) : (stepCount(num-1)+1);
    }
    public int numberOfSteps(int num) {
        return stepCount(num);
    }
}