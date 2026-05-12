class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre = "";
        
        Arrays.sort(strs);
        if (strs.length == 0) return pre;
        if (strs.length == 1) return strs[0];
    for(int i=0;i<strs[0].length();i++){
        int count=0;
        for(int j=1;j<strs.length;j++){
            if(strs[j].charAt(i)==strs[0].charAt(i)){
            count++;
            }
   if(count>=strs.length-1)  {
       pre+=strs[0].charAt(i);
   }  
            if(strs[j].charAt(i)!=strs[0].charAt(i)){
          return pre;      
            }
            
        }
    }
        
        

        return pre;
    }
}