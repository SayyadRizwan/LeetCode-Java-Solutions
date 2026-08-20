class Solution {
    int lcs(String text1,String text2,int idx1,int idx2){
        if(idx1==text1.length()  || idx2==text2.length()){
            return 0;
        }
        if(dp[idx1][idx2]!=-1)return dp[idx1][idx2];
        char c1 = 'A';
        char c2 = 'B';
        int cnt =0;
        if(idx1< text1.length())c1 = text1.charAt(idx1);
        if(idx2< text2.length())c2 = text2.charAt(idx2);
        if(c1==c2)return(dp[idx1][idx2]=    1+lcs(text1,text2,idx1+1,idx2+1));
        int max1 = Math.max(lcs(text1,text2,idx1+1,idx2),lcs(text1,text2,idx1,idx2+1));
        return dp[idx1][idx2]= max1;

    }
    int[][]dp ;
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()+1][text2.length()+1];
        for(int[] arr : dp)Arrays.fill(arr,-1);
        return lcs(text1,text2,0,0);
    }
}