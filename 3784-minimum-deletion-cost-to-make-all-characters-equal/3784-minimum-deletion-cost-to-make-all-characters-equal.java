class Solution {
    public long minCost(String s, int[] cost) {
        HashMap<Character, Long> hm = new HashMap<>();
        String st="";
        long sum=0;
     for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0L) + cost[i]);
            sum += cost[i];
        }
        if(st.length()==1)return 0;
        long ans=Long.MAX_VALUE;
      for (long keepSum : hm.values()) {
            ans = Math.min(ans, sum - keepSum);
        }
        return ans;
    }
}