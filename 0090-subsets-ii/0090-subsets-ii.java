class Solution {
    void subset(int[] nums, int idx , List<List<Integer>> ans , List<Integer> temp,HashSet<List<Integer>> hs){
        if(idx == nums.length){
            if(!hs.contains(new ArrayList<>(temp))){
                ans.add(new ArrayList<>(temp));
                hs.add(new ArrayList<>(temp));
           }
                return ; 
             }
            temp.add(nums[idx]);
            subset(nums,idx+1,ans,temp,hs);
            temp.remove(temp.size()-1);
            subset(nums,idx+1,ans,temp,hs);



    }
    


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       HashSet<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums,0,ans,new ArrayList<Integer>(),hs);
        return ans;
        
    }
}