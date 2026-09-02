class Solution {

    boolean palCheck(StringBuilder s){
         int st = 0;
        int end = s.length()-1;
        
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
    }
    return true;
    }


    public boolean validPalindrome(String s) {

         int st = 0;
        int end = s.length()-1;
        int idx1 = -1;
        int idx2=-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                idx1=st;
                idx2=end;
                break;
            }
            st++;
            end--;
        }
        if(idx1==-1 && idx2==-1)return true;
  StringBuilder sb1 = new StringBuilder(s);
StringBuilder sb2 = new StringBuilder(s);

sb1.delete(idx1, idx1 + 1);
sb2.delete(idx2, idx2 + 1);
        boolean flag1 = palCheck(sb1);
        boolean flag2 = palCheck(sb2);
        return flag1 || flag2;
        
    }
}