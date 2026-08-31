class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            hs.add(nums[i]);
        }
        
        int[] arr = new int[k];
      
        for(int i=0;i<k;i++){
              int count=0;
              int maxVal = -19999959;
            for(int num : hs){
                if(hm.get(num)>=count){
                    maxVal=num;
                    count= hm.get(num);
                }
            }
            arr[i]=maxVal;
            hs.remove(maxVal);
        }
        return arr;
    }
}