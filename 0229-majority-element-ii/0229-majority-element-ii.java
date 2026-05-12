class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result= new ArrayList<>();
        Arrays.sort(nums);
        int var=nums[0];
        int count=0;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int num: nums){
            if(var==num){
                count++;
            }
            if(var!=num){
                var=num;
                count=1;
            }
            if(count>nums.length/3){
                if(max1==Integer.MIN_VALUE){
                    max1=num;
                    
                }
 
        if(max2 == Integer.MIN_VALUE && num!= max1){
     max2=num;
 }                   
                
                
            }
        }
        if(max1 != Integer.MIN_VALUE) result.add(max1);
        if(max2 != Integer.MIN_VALUE ) result.add(max2);
        
        return result;
    
    }
}