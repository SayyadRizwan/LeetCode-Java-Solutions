class Solution {
       HashMap<Integer,Integer> hm = new HashMap<>();

    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int sum=0;
        int min=0;
        int max=nums.length;
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]))ans[0]=nums[i];
            hs.add(nums[i]);
            sum+=nums[i];

            
        }
        int total =(max*max)+ max;

        
        ans[1]= (total/2)- (sum-ans[0]);
        return ans;


     
    }
}