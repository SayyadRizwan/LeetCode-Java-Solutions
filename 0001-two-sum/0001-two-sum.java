class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length; i++ ){
            int[] ans=new int[2];
            if(map.containsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
                return ans;
            }   // true/false
            map.put(nums[i],i);
        }
        return null;
        
    }
}