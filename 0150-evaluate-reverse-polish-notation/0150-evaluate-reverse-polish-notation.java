class Solution {
    int operate(int a , int b, String op ){
        if(op.equals("+")){
           
            return a+b;
        }
        if(op.equals("-")){
           
            return b-a;
        }
          if(op.equals("*")){
            
            return a*b;
        }
          if(op.equals("/")){
          
            return b/a;
        }
        return 1;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") ||token.equals("*")|| token.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(operate(a,b, token));
            }
            else{
                st.push( Integer.parseInt(token));
            }
        }
        return st.peek();

    }
}