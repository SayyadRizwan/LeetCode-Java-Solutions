class Solution {

    void Subset(int[] nums, int idx,List<List<Integer>> ans,List<Integer> temp){
        if(idx==nums.length){
            List<Integer> copy = new ArrayList<>(temp);
            ans.add(copy);
            return;
        }
    //take
    temp.add(nums[idx]);
    Subset(nums,idx+1,ans,temp);
    temp.remove(temp.size()-1);

    Subset(nums,idx+1,ans,temp);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Subset(nums,0,ans,new ArrayList<>());
        return ans;

    }
}