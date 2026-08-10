class Solution {
    int max =  Integer.MAX_VALUE;
    int editDistance(String word1,String word2 , int i, int j){
                if (i < 0) return j + 1;
        if (j < 0) return i + 1;
        if(dp[i][j]!=-1)return dp[i][j];
        char c1 = word1.charAt(i);
        char c2 = word2.charAt(j);
        if(c1==c2)return editDistance(word1,word2,i-1,j-1);
     return dp[i][j] = 1 + Math.min(
    Math.min(
        editDistance(word1, word2, i - 1, j - 1),
        editDistance(word1, word2, i - 1, j)
    ),
    editDistance(word1, word2, i, j - 1)
);
    }

int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()+1][word2.length() +1];
        for(int[] arr : dp)Arrays.fill(arr,-1);
       return editDistance(word1,word2,word1.length()-1,word2.length()-1); 
    }
}