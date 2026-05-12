class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] arr = new int[26];

        // count frequencies
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int[] groupSize = new int[s.length() + 1];
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0)
                groupSize[arr[i]]++;
        }

        // find best frequency
        int bestFreq = 0, bestSize = 0;
        for (int f = 1; f <= s.length(); f++) {
            if (groupSize[f] > bestSize || (groupSize[f] == bestSize && f > bestFreq)) {
                bestSize = groupSize[f];
                bestFreq = f;
            }
        }

        String ans = "";
        for (int i = 0; i < 26; i++) {
            if (arr[i] == bestFreq)
                ans += (char) ('a' + i);
        }
        return ans;
    }
}
