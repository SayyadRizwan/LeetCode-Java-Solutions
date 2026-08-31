class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<Character, Integer>[] hm = new HashMap[strs.length];
       for(int i=0;i<strs.length;i++){
        HashMap<Character,Integer> temp = new HashMap<>();
        for(int j=0;j<strs[i].length();j++){
            char c = strs[i].charAt(j);
            if(temp.containsKey(c)){
                temp.put(c,temp.get(c)+1);
            }
            else{
                temp.put(c,1);
            }
        }
        hm[i]=temp;
       }
       String str = "@19*riz";
      
       List<List<String>> ans  = new ArrayList<>();
       for(int i=0;i<strs.length;i++ ){
         List<String> ls = new ArrayList<>();
         if(strs[i].equals(str))continue;
         ls.add(strs[i]);
        for(int j=i+1;j<strs.length;j++){
           
            if(strs[i].equals(str))continue;
            if(hm[i].equals(hm[j])){
                ls.add(strs[j]);
                strs[j]= str;
            }
        }
        ans.add(ls);
       }
       return ans;

    }
}