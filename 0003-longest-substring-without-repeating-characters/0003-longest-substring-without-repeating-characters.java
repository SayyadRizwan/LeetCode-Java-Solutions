class Solution {
    public static boolean containsChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int max = 0;
        String substr = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (containsChar(substr, ch)) {
                // Remove chars from substr start until ch is removed
                int index = substr.indexOf(ch);
                substr = substr.substring(index + 1);
            }
            
            substr += ch;
            max = Math.max(max, substr.length());
        }

        return max;
    }
}