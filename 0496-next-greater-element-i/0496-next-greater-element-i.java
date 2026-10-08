class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums2){
       
            while(!st.isEmpty() && st.peek()<num){
                hm.put(st.peek(),num);
                st.pop();
            }
                 st.push(num);
          
        }  
       // int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
                
                 ans[i] = hm.getOrDefault(nums1[i],-1);
        } 
       
                return ans;
    }
}