class Solution {
    
    



    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                List<Integer> temp = hm.get(nums[i]);
                temp.add(i);
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                hm.put(nums[i],temp);
            }
        }
           int[] arr = new int[queries.length];

        if(!hm.containsKey(x)) {
            Arrays.fill(arr,-1);
            return arr;
        }

        

     
        List<Integer> occurence = hm.get(x);
        


        for(int i=0;i<queries.length;i++){
            if(queries[i]>occurence.size() ){
                arr[i]= -1;
                continue;
            }
            arr[i]= occurence.get(queries[i]-1);


        }
        return arr;
    }
}