class Solution {
    public int[] getConcatenation(int[] nums) {
        int fp=0;
        int sp=nums.length;
        int merged[]= new int[2*nums.length];
        for(int i=0;i<nums.length;i++){  

            merged[fp]=nums[i];
            merged[sp]=nums[i];
            fp++;
            sp++;

        }
        return merged;
    }
}