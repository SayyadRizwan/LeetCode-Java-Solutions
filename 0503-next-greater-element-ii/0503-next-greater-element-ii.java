class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> hs = new HashSet<>();
        int ans[] = new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(!st.isEmpty() && nums[st.peek()]<num){
                ans[st.peek()] = num;
                hs.add(st.peek());
                st.pop();
            }
            st.push(i);
        }
                for(int i=0;i<nums.length;i++){
            int num = nums[i];
            while(!st.isEmpty() && nums[st.peek()]<num){
              if(!hs.contains(st.peek()))  ans[st.peek()] = num;
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}