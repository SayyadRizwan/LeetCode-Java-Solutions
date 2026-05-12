class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int count2=nums.length-1;
        int arr[]=new int[nums.length];
        for(int num:nums){
            if(num!=0){
                arr[count]=num;
                count++;
            }
            else{
                arr[count2]=num;
                count2--;
            }
        }
        int i=0;
        for(int num:arr){
            nums[i]=num;
            i++;
        }
        }
    }
