class Solution {
    int[][] dp;

    int subSeq(char[] arr1, char[] arr2, int i, int j) {

        if (i >= arr1.length || j >= arr2.length)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (arr1[i] == arr2[j]) {
            return dp[i][j] = 1 + subSeq(arr1, arr2, i + 1, j + 1);
        }

        return dp[i][j] = Math.max(
            subSeq(arr1, arr2, i + 1, j),
            subSeq(arr1, arr2, i, j + 1)
        );
    }

    public int longestCommonSubsequence(String text1, String text2) {

        dp = new int[text1.length()][text2.length()];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        return subSeq(arr1, arr2, 0, 0);
    }
}