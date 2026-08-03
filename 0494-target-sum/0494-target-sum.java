class Solution {
    int totalWays(int[] nums, int target, int idx, int count) {
        if (idx >= nums.length) {
            return (target == 0) ? count + 1 : count;
        }
        String key = idx +  "," + target;
        if(hm.containsKey(key))return hm.get(key);
      
        int take = totalWays(nums, target - nums[idx], idx + 1, count);
        int skip = totalWays(nums, target + nums[idx], idx + 1, count);
        hm.put(key,take+skip);
        return take + skip;

    }
      HashMap<String,Integer> hm = new HashMap<>();
    

    public int findTargetSumWays(int[] nums, int target) {

        return totalWays(nums, target, 0, 0);
    }
}