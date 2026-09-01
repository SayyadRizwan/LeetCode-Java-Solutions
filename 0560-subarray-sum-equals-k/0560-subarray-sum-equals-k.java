class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int pref[] = new int[nums.length];
        int count=0;
        pref[0]= nums[0];
        for(int i=0;i<nums.length;i++){

           pref[i]= (i!=0) ?pref[i-1]+nums[i]:pref[0];
          
            int val =(pref[i]-k);
            count+=hm.getOrDefault(val,0);
              hm.put(pref[i],hm.getOrDefault(pref[i],0)+1);
        }
        return count;
       
       
    }
}