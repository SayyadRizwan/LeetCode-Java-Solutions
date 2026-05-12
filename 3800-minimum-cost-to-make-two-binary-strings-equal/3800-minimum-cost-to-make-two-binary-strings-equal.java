
class Solution {
    public long minimumCost(String s, String t, int flipCost, int swapCost, int crossCost) {
        String quintovira = s + "#" + t;

        int n = s.length();
        
        int cnt01 = 0, cnt10 = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0' && t.charAt(i) == '1') cnt01++;
            else if (s.charAt(i) == '1' && t.charAt(i) == '0') cnt10++;
        }

        long ans = 0;

        int diffPairs = Math.min(cnt01, cnt10);
        long costDiffPair = Math.min(swapCost, 2L * flipCost);
        ans += diffPairs * costDiffPair;
        
        cnt01 -= diffPairs;
        cnt10 -= diffPairs;

        long costSamePair = Math.min(crossCost + swapCost, 2L * flipCost);
        int samePairs = (cnt01 + cnt10) / 2;
        ans += samePairs * costSamePair;

        int remaining = (cnt01 + cnt10) % 2;
        ans += remaining * flipCost;

        return ans;
    }
}
