class Solution {
    int helper(int a,int b){
        if(Math.abs(a)==Math.abs(b))return 0;
        return (Math.abs(a)>Math.abs(b))? a:b;
    }
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int curr = asteroids[0];
        st.push(curr);
       
        for(int i=1;i<asteroids.length;i++){
            curr= asteroids[i];
            while(!st.isEmpty() && (curr<0 && st.peek()>0)){
                int val = st.pop();
                curr=helper(curr,val);
            }
            if(curr!=0)st.push(curr);
        }
        int ans[] = new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}