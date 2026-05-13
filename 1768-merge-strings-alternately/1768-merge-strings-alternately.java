class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min= Math.min(word1.length(),word2.length());
            for(int i=0;i<min;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }

            for(int j=min;j<word1.length();j++){
                    sb.append(word1.charAt(j));
                }
            for(int j=min;j<word2.length();j++){
                    sb.append(word2.charAt(j));
                }
                return sb.toString();
         
        }
    
}