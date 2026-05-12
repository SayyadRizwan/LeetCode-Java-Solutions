class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD=1000000007;
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j+=queries[i][2]){
           nums[j] = (int)(((long)nums[j] * queries[i][3]) % MOD);
            }
        }
        if (nums.length==1){
            return nums[0];
        }
        int n=0;
        for(int i=0;i<nums.length;i++){
            n^=nums[i];
        }
        return n;
        
    }
}