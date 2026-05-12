class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        Stack<Character> ans=new Stack<>();
        while(!stack.empty()){
    if(stack.peek()==')'){
        ans.push('(');
    }
    else if(stack.peek()=='}'){
        ans.push('{');
    }
       else if(stack.peek()==']'){
        ans.push('[');
       }
     else if(ans.empty()){
        return false;
    }
    else if(stack.peek()==ans.peek()){
                ans.pop();
    }

            else{
return false;
                
            }
            stack.pop();
            
    
            
        }
        
        return ans.empty();
    }
}