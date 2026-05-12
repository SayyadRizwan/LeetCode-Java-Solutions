class Solution {
    public String largestEven(String s) {
        int i = s.lastIndexOf('2');
        if (i == -1) return "";
        return s.substring(0, i + 1);
    }
}