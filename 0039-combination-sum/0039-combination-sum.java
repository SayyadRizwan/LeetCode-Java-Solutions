class Solution {

    void combinationSubset(int[] candidates,int target,int idx,List<List<Integer>> ans , List<Integer> temp){
        if(target<0)return;
        if(idx==candidates.length){
            if(target==0){
            ArrayList<Integer> copy = new ArrayList<>(temp);
            ans.add(copy);
            
        }
        return ;
    }
    //skip
    combinationSubset(candidates,target,idx+1,ans,temp);
   temp.add(candidates[idx]);
    combinationSubset(candidates,target-candidates[idx],idx,ans,temp);
    temp.remove(temp.size()-1);


      
  

        

    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        combinationSubset(candidates,target,0,ans,new ArrayList<>());
        return ans;
        
    }
}