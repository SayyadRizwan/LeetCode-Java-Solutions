class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int st=0;
        int end = numbers.length-1;
        int temp[] = new int[2];
        while(st<end){
            int sum=numbers[st]+numbers[end];
            if(sum==target){
                temp[0]=st+1;
                temp[1]= end+1;
                return temp;
            }
           else if(sum>target){
                end--;
            }
            else{
                st++;
            }
        }
        return temp;
    }
}