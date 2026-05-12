class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int[] ans = new int[k];
    
        ans[0] = nums[(nums.length  - 1)];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
          if (count == k) {
                return ans;
            } 
          else {
                if (ans[count - 1] != nums[nums.length - i - 1]) {
                    ans[count] = nums[nums.length - i - 1];
                    count++;
                }
            }

        }
        if (count < k) {
            int newans[] = new int[count];
            for (int i = 0; i < newans.length; i++) {
                newans[i] = ans[i];
                
            }
            return newans;
        }
        return ans;
    }
}