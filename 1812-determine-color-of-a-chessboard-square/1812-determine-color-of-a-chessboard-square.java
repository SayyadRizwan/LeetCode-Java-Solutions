class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c1= coordinates.charAt(0)-'a';
        int c2 = coordinates.charAt(1)-'0';
        if(c1%2==c2%2){
            return true;
        }
        return false;
    }
}