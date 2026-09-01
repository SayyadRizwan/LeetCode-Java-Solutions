class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        HashMap<Integer,List<List<Integer>>> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(j);
                int val = nums1[i]+nums2[j];
                 List<List<Integer>> l = new ArrayList<>();
                l.add(temp);
                if(hm.containsKey(val)){
                    hm.get(val).add(temp);
                }
               
                else{
                    hm.put(val,l);
                }
            }
        }
        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums4.length;j++){
                int val =nums3[i]+nums4[j];
                int rem = 0-val;
                if(hm.containsKey(rem)){
                    count+=hm.get(rem).size();
                }
            }
        }
        return count;
    }
}