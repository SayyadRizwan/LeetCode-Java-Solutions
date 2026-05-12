class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        
        while(i<j){
            while(helper(s.charAt(i))&&i<j){
                i++;
            }
            while(helper(s.charAt(j))&&i<j){
                j--;
            }
            if(!(s.charAt(i)==s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
    private boolean helper(char c){
        return !((c>='a'&&c<='z')||(c>='0'&& c<='9'));
        
    }
}