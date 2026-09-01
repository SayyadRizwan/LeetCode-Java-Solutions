class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        long max = 1;
        for(int i=0;i<nums.length;i++){
                hm.put(nums[i],1);
                max = Math.max(nums[i],max);
        }
        for(int i=1;i<max+2;i++){
            if(!hm.containsKey(i))return i;
        }
        return (int)max+1;
    }
}