class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List<List<Integer>> ans = new ArrayList<>();
         HashSet<List<Integer>> hs = new HashSet<>();
         Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            
            for(int j=i+1;j<nums.length;j++){
               long rem = (long)target - nums[i] - nums[j];
                int st = j+1;
                int end = nums.length-1;
                
                while(st<end){
                    long sum = (long)nums[st]+nums[end];
                    if(sum==rem){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[st]);
                        temp.add(nums[end]);
                        ans.add(temp);
                        st++;
                        end--;
                    }
                    else if(sum<rem){
                        st++;
                     }
                     else if(sum>rem){
                        end--;
                     }
                }
            }
        }

    List<List<Integer>> result = new ArrayList<>();
    for(int i=0;i<ans.size();i++){
        Collections.sort(ans.get(i));
        List<Integer> temp = ans.get(i);
        if(!hs.contains(temp)){
            result.add(temp);
        }
        hs.add(temp);
    }



        return result;



         }
}