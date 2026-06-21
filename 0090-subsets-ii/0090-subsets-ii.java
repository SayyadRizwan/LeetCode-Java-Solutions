class Solution {
    void subsetSum(int[] nums,int idx,List<List<Integer>> ans, List<Integer> temp){
        if(idx==nums.length){
            List<Integer> copy = new ArrayList<>(temp);
            ans.add(copy);
            return ;
        }
        temp.add(nums[idx]);
        subsetSum(nums,idx+1,ans,temp);
        temp.remove(temp.size()-1);
         subsetSum(nums,idx+1,ans,temp);


    }



    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         subsetSum(nums,0,ans,new ArrayList<Integer>());
        List<List<Integer>> subset = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(List<Integer> elem : ans){
            
            Collections.sort(elem);
            if(!hs.contains(elem)){
                subset.add(elem);
            }
            hs.add(elem);
        }




         return subset;
        
    }
}