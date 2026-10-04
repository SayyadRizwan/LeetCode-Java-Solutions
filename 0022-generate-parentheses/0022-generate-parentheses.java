class Solution {
     List<String> ans ;
     void generate(int n,String finalAns,int count){
        if(finalAns.length()==2*n){
            
            validate(finalAns);
            return ;
        }
        if(count<0)return;
        
        generate(n,finalAns+"(",count+1);
       // finalAns = finalAns.substring(0,finalAns.length()-1);
        generate(n,finalAns+")",count-1);
   //      finalAns = finalAns.substring(0,finalAns.length()-1);


     } 

     void validate(String str){
        boolean flag = true;
        int count=0;
        for(int i=0;i<str.length();i++){
            if(count<0)flag=false;
            if(str.charAt(i)=='(')count++;
            else{
                count--;
            }
        }
        if(flag && count==0)ans.add(str);
     }

    public List<String> generateParenthesis(int n) {
        ans = new ArrayList<>();
        generate(n,"",0);
        return ans;
    }
}